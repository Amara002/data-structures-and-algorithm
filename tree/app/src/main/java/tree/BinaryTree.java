package tree;

import java.util.ArrayList;

public class BinaryTree<T> {
    Node <T> root;
    public ArrayList<Integer> preOrderArr = new ArrayList<>();
    public ArrayList<Integer> inOrderArr = new ArrayList<>();
    public ArrayList<Integer> postOrderArr = new ArrayList<>();
    public BinaryTree() {
        this.root = null;
    }
    public void postorder(Node<T> node)
    {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key + " ");
        postOrderArr.add(node.key);
    }



    public void postorder() {
        postorder(root);
    }

    public void inorder(Node<T> node)
    {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.key + " ");
        inOrderArr.add(node.key);
        inorder(node.right);
    }
    public void inorder() {
        inorder(root);
    }

    public void preOrder(Node<T> node)
    {
        if (node == null)

            return;
        System.out.print(node.key + " ");
        preOrderArr.add(node.key);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void preOrder() {
        preOrder(root);
    }


    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
