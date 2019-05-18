import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class BinarySearchTreeTest {
    @Test
    public void adding_left_node_value_less_than_root_should_be_valid()
    {
        BinarySearchTree tree = new BinarySearchTree(4);
        tree.root.addLeftChild(2);
        assertEquals(2, tree.root.getLeftChild().getValue());
    }

    @Test
    public void adding_left_node_value_greater_than_root_should_throw_error()
    {
        BinarySearchTree tree = new BinarySearchTree(4);

        try {
            tree.root.addLeftChild(5);
            fail("Invalid input should be rejected");
        }
        catch(IllegalArgumentException e){

        }
    }

    @Test
    public void adding_right_node_value_greater_than_root_should_be_valid()
    {
        BinarySearchTree tree = new BinarySearchTree(4);
        tree.root.addRightChild(6);
        assertEquals(6, tree.root.getRightChild().getValue());
    }

    @Test
    public void adding_right_node_value_less_than_root_should_throw_error()
    {
        BinarySearchTree tree = new BinarySearchTree(4);

        try {
            tree.root.addRightChild(3);
            fail("Invalid input should be rejected");
        }
        catch(IllegalArgumentException e){

        }
    }
}
