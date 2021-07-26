package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {

    public ArrayList<Integer> breadthFirst(BinaryTree tree) {
        ArrayList<Integer> list = new ArrayList<>();
        if (tree.root == null) {
            return null;
        }
            Queue<Node> nodes = new LinkedList<Node>();
            nodes.add(tree.root);

            while (!nodes.isEmpty()) {

                Node node = nodes.remove();
                list.add(node.key);

                if (node.left != null) {
                    nodes.add(node.left);
                }

                if (node.right != null) {
                    nodes.add(node.right);
                }
            }

            return list;

        }
}
