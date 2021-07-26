package tree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BreadthFirstTest {
    @Test
    public void breadthFirstEmptyTreeTest(){

        BinaryTree binaryTreeTest = new BinaryTree();

        assertNull(binaryTreeTest.breadthFirst(binaryTreeTest));
    }

    @Test
    public void breadthFirstValuesInTreeTest(){
        BinaryTree binaryTreeTest = new BinaryTree();

        binaryTreeTest.root = (new Node(1));
        assertEquals("[1]",binaryTreeTest.breadthFirst(binaryTreeTest).toString());

        binaryTreeTest.root.left = (new Node(2));
        binaryTreeTest.root.right = (new Node(3));
        assertEquals("[1, 2, 3]",binaryTreeTest.breadthFirst(binaryTreeTest).toString());

        binaryTreeTest.root.left.left = (new Node(4));
        assertEquals("[1, 2, 3, 4]",binaryTreeTest.breadthFirst(binaryTreeTest).toString());

        binaryTreeTest.root.left.left.left = (new Node(5));
        assertEquals("[1, 2, 3, 4, 5]",binaryTreeTest.breadthFirst(binaryTreeTest).toString());

        binaryTreeTest.root.right.left = (new Node(6));
        assertEquals("[1, 2, 3, 4, 6, 5]",binaryTreeTest.breadthFirst(binaryTreeTest).toString());

    }
}
