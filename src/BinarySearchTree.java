public class BinarySearchTree<E extends Comparable<E>> {
    TreeNode root;

    public BinarySearchTree(E value) {
        this.root = new TreeNode<>(value, null);
    }
}

class TreeNode<E extends Comparable<E>> {
    private E value;
    private TreeNode<E> parent;
    private TreeNode<E> left;
    private TreeNode<E> right;

    public TreeNode(E value, TreeNode<E> parent)
    {
        this.value = value;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }

    public E getValue()
    {
        return this.value;
    }

    public TreeNode<E> getLeftChild()
    {
        return left;
    }

    public TreeNode<E> getRightChild()
    {
        return right;
    }

    public TreeNode<E> addLeftChild(E value)
    {
        if (value.compareTo(this.value) > 0) {
            throw new IllegalArgumentException("Value is higher than the parent value");
        }

        this.left = new TreeNode<>(value, this);
        return this.left;
    }

    public TreeNode<E> addRightChild(E value)
    {
        if (value.compareTo(this.value) < 0) {
            throw new IllegalArgumentException("Value is smaller than the parent value");
        }

        this.right = new TreeNode<>(value, this);
        return this.right;
    }
}
