package BST;

import BinarySearchTree.BinarySearchTreeNode;
import Tree.Tree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BST {
    public static void main(String[] args) {
        int value;
        BinarySearchTreeNode root = new BinarySearchTreeNode();

        Tree tree = new Tree();
        tree.insert(10,43);
        tree.insert(31,32);
        tree.insert(11,33);
        tree.insert(44,82);
        tree.insert(8,99);
        tree.insert(35,11);
        tree.insert(12,19);
        tree.insert(7,66);

       tree.PreOrder(root);
       tree.displayTree();
    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    // -------------------------------------------------------------
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    //-------------------------------------------------------------
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
