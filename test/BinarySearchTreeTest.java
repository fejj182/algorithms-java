import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

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

    @Test
    public void find_root_node()
    {
        BinarySearchTree tree = new BinarySearchTree(4);
        assertEquals(4, tree.find(4).getValue());
    }

    @Test
    public void not_found()
    {
        BinarySearchTree tree = new BinarySearchTree(4);
        try {
            tree.find(6);
            fail("Value shouldn't be found");
        }
        catch(NoSuchElementException e){

        }
    }

    @Test
    public void find_left_node()
    {
        BinarySearchTree tree = new BinarySearchTree(4);
        tree.root.addLeftChild(2);
        assertEquals(2, tree.find(2).getValue());
    }

    @Test
    public void find_right_node()
    {
        BinarySearchTree tree = new BinarySearchTree(4);
        tree.root.addRightChild(6);
        assertEquals(6, tree.find(6).getValue());
    }

    @Test
    public void find_right_node_large()
    {
        BinarySearchTree tree = new BinarySearchTree(4);
        tree.root.addRightChild(6);
        try {
            tree.find(8);
            fail("Value shouldn't be found");
        }
        catch(NoSuchElementException e){

        }
    }

    @Test
    public void insert_left_node()
    {
        BinarySearchTree tree = new BinarySearchTree("g");
        tree.insert("a");
        assertEquals(true, tree.contains("a"));
    }

    @Test
    public void insert_multiple_left_nodes()
    {
        BinarySearchTree tree = new BinarySearchTree("g");
        tree.insert("b");
        tree.insert("a");
        assertEquals(true, tree.contains("a"));
        assertEquals(true, tree.contains("b"));
        assertEquals("b", tree.root.getLeftChild().getValue());
        assertEquals("a", tree.root.getLeftChild().getLeftChild().getValue());
    }

    @Test
    public void insert_left_nodes_reverse_order()
    {
        BinarySearchTree tree = new BinarySearchTree("g");
        tree.insert("a");
        tree.insert("b");
        assertEquals(true, tree.contains("a"));
        assertEquals(true, tree.contains("b"));
        assertEquals("a", tree.root.getLeftChild().getValue());
        assertEquals("b", tree.root.getLeftChild().getRightChild().getValue());
    }

    @Test
    public void insert_right_node()
    {
        BinarySearchTree tree = new BinarySearchTree("g");
        tree.insert("v");
        assertEquals(true, tree.contains("v"));
    }

    @Test
    public void cannot_insert_same_node_twice()
    {
        BinarySearchTree tree = new BinarySearchTree(4);
        try {
            tree.insert(4);
            fail("Value has been incorrectly inserted");
        }
        catch(IllegalArgumentException e){

        }
    }
}
