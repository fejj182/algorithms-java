import java.util.NoSuchElementException;

public class BinarySearchTree<E extends Comparable<E>> {
    TreeNode<E> root;

    public BinarySearchTree(E value) {
        this.root = new TreeNode<>(value, null);
    }

    public TreeNode<E> find(E value){
        if (value.equals(root.getValue())) {
            return root;
        } else if (value.compareTo(root.getValue()) < 0) {
            return this.find(value, root.getLeftChild());
        } else if (value.compareTo(root.getValue()) > 0) {
            return this.find(value, root.getRightChild());
        }

        throw new NoSuchElementException("Element cannot be found");
    }

    public TreeNode<E> find(E value, TreeNode<E> root){
        if (value.equals(root.getValue())) {
            return root;
        } else if (value.compareTo(root.getValue()) < 0 && root.getLeftChild() != null) {
            return this.find(value, root.getLeftChild());
        } else if (value.compareTo(root.getValue()) > 0 && root.getRightChild() != null) {
            return this.find(value, root.getRightChild());
        }

        throw new NoSuchElementException("Element cannot be found");
    }

    public void insert(E value) {
        if (value.compareTo(root.getValue()) < 0) {
            if (root.getLeftChild() != null) {
                this.insert(value, root.getLeftChild());
            } else {
                root.addLeftChild(value);
            }
        } else if (value.compareTo(root.getValue()) > 0) {
            if (root.getRightChild() != null) {
                this.insert(value, root.getRightChild());
            } else {
                root.addRightChild(value);
            }
        } else {
            throw new IllegalArgumentException("Value already present in tree");
        }
    }

    public void insert(E value, TreeNode<E> root) {
        if (value.compareTo(root.getValue()) < 0) {
            if (root.getLeftChild() != null) {
                this.insert(value, root.getLeftChild());
            } else {
                root.addLeftChild(value);
            }
        } else if (value.compareTo(root.getValue()) > 0) {
            if (root.getRightChild() != null) {
                this.insert(value, root.getRightChild());
            } else {
                root.addRightChild(value);
            }
        } else {
            throw new IllegalArgumentException("Value already present in tree");
        }
    }

    public boolean contains(E value) {
        TreeNode<E> current = root;
        while (current != null) {
            if (value == current.getValue()) {
                return true;
            } else if (value.compareTo(current.getValue()) < 0) {
                current = current.getLeftChild();
            } else if (value.compareTo(current.getValue()) > 0) {
                current = current.getRightChild();
            }
        }
        return false;
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
