package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KAryTree <T> {

    NodeKAry root=null;
    int nodes = 0;
    int K=0;


    public KAryTree(int k) {
        if(k<=1)
            k=2;
        this.K = k;
    }

    public boolean isEmpty() {

        return root == null;
    }

    public boolean isNotEmpty(){
        return root != null;
    }

    public void add(T value){
        nodes++;
        NodeKAry newNode = new NodeKAry(value);
        if( isEmpty()){
            root = newNode;
            return;
        }
        Queue<NodeKAry> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            NodeKAry currentNode = queue.poll();
            if(currentNode.children.size() < this.K){
                currentNode.addChild(newNode);
                return;
            }
            else {
                queue.addAll(currentNode.children);
            }
        }
    }

    public List<T> breadthFirstSearch(){
        List <T> tree = new ArrayList<>();
        Queue<NodeKAry> queue = new LinkedList<>();
        if(isNotEmpty()){
            queue.add(root);
            while(!queue.isEmpty()){

                NodeKAry currentNode = queue.poll();
                tree.add((T)currentNode.value);

                if(! currentNode.children.isEmpty())
                    queue.addAll(currentNode.children);
            }
        }
        return tree;
    }


    public int getSize(){
        return nodes;
    }
    public static KAryTree<String> fizzBuzzTree(KAryTree<Integer> kTree){
        KAryTree<String> outTree = new KAryTree(kTree.K);

        Queue<NodeKAry> queue = new LinkedList<>();
        if(kTree.isNotEmpty()){
            queue.add(kTree.root);
            while(!queue.isEmpty()){

                NodeKAry<Integer> currentNode = queue.poll();

                String currentValue;
                if(currentNode.value % 3 == 0 && currentNode.value % 5 ==0 )
                    currentValue = "FizzBuzz";
                else if((int)currentNode.value % 3 == 0)
                    currentValue="Fizz";
                else if((int)currentNode.value % 5 == 0)
                    currentValue="Buzz";
                else
                    currentValue=currentNode.value.toString();

                outTree.add(currentValue);

                if(! currentNode.children.isEmpty())
                    queue.addAll(currentNode.children);
            }
        }
        return outTree;
    }


    @Override
    public String toString() {
        return "K-ary tree (K="+this.K+"): {" +
                "\n root=" + root +
                "\nnodes=" + nodes +
                '}';
    }
}
