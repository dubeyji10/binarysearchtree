package BinarySearchTree;

public class BinarySearchTreeNode {
    private int id;
    private int data;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTreeNode left) {
        this.left = left;
    }

    public BinarySearchTreeNode getRight() {
        return right;
    }

    public void setRight(BinarySearchTreeNode right) {
        this.right = right;
    }
    public void displayNode()      // display ourself
    {
        System.out.print('{');
        System.out.print(getId());
        System.out.print(", ");
        System.out.print(getData());
        System.out.print("} ");
    }
}
