//package tree;
//
//public class BinarySearch<T> {
//    Node <T>root;
//    BinarySearch()
//    {
//        root = null;
//    }
//
//    public boolean Contains( int key) {
//
//        while (root != null) {
//            if ((int) root.key < key) {
//                root = root.right;
//            } else if ((int)root.key > key) {
//                root = root.left;
//            }
//            else
//                return true;
//        }
//        return false;
//    }
//
//    public void add(int key) {
//        if (root == null) {
//            root = new Node(key);
//        } else {
//            Node current = root;
//            traverse(current, key);
//        }
//    }
//    private void traverse(Node current, int key) {
//        if (key > (int) current.key) {
//            if (current.right == null) {
//                current.right=new Node(key);
//                return;
//            }
//
//            current = current.right;
//        } else {
//            if (current.left == null) {
//                current.left =new Node(key);
//                return;
//            }
//
//            current = current.left;
//        }
//        traverse(current, key);
//    }
//
//    public void inorder()
//    {
//        inorderRec(root);
//    }
//
//    public void inorderRec(Node root)
//    {
//        if (root != null) {
//            inorderRec(root.left);
//            System.out.println(root.key);
//            inorderRec(root.right);
//        }
//    }
//}
