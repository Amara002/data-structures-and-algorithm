package hashTable;


import hashTable.BinaryTree.BinaryTree;
import hashTable.BinaryTree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class IntersectionTest {

    @Test
    public void intersectionTreeTest(){

        HashTable<Integer,Integer> trees = new HashTable<Integer, Integer>();
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        tree1.setRoot(new Node(150));
        tree1.getRoot().setLeft(new Node(100));
        tree1.getRoot().setRight(new Node(250));
        tree1.getRoot().getRight().setLeft(new Node(200));
        tree1.getRoot().getRight().setRight(new Node(350));

        tree2.setRoot(new Node(42));
        tree2.getRoot().setLeft(new Node(100));
        tree2.getRoot().setRight(new Node(600));
        tree2.getRoot().getRight().setLeft(new Node(200));
        tree2.getRoot().getRight().setRight(new Node(350));

        assertEquals("[100, 200, 350]", trees.treeIntersection(tree1,tree2).toString());

    }

    @Test
    public void intersectionTreeTestNoResults(){

        HashTable<Integer,Integer> trees = new HashTable<Integer, Integer>();
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        tree1.setRoot(new Node(150));
        tree1.getRoot().setLeft(new Node(100));
        tree1.getRoot().setRight(new Node(250));
        tree1.getRoot().getRight().setLeft(new Node(200));
        tree1.getRoot().getRight().setRight(new Node(350));

        tree2.setRoot(new Node(42));
        tree2.getRoot().setLeft(new Node(101));
        tree2.getRoot().setRight(new Node(600));
        tree2.getRoot().getRight().setLeft(new Node(201));
        tree2.getRoot().getRight().setRight(new Node(310));

        assertEquals("[]", trees.treeIntersection(tree1,tree2).toString());

    }

    @Test
    public void intersectionTreeDifferentNumOfNodes(){

        HashTable<Integer,Integer> trees = new HashTable<Integer, Integer>();
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        tree1.setRoot(new Node(150));
        tree1.getRoot().setLeft(new Node(100));
        tree1.getRoot().setRight(new Node(250));
        tree1.getRoot().getRight().setLeft(new Node(200));
        tree1.getRoot().getRight().setRight(new Node(350));

        tree2.setRoot(new Node(42));
        tree2.getRoot().setLeft(new Node(100));
        tree2.getRoot().setRight(new Node(600));
        tree2.getRoot().getRight().setLeft(new Node(200));

        assertEquals("[100, 200]", trees.treeIntersection(tree1,tree2).toString());

    }
}
