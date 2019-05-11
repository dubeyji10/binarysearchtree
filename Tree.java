package Tree;

import BinarySearchTree.BinarySearchTreeNode;
import java.util.Stack;
public class Tree {
    BinarySearchTreeNode root=null;

//traversing BST

    public void PreOrder(BinarySearchTreeNode root){
        // PreOrder -> DLR
        if(root!=null){
            System.out.println(root.getData());
            PreOrder(root.getLeft());
            PreOrder(root.getRight());
        }
    }

    public void InOrder(BinarySearchTreeNode root){
         // InOrder -> LDR
         if(root!=null){
              InOrder(root.getLeft());
             System.out.println(root.getData());
              InOrder(root.getRight());
         }
    }

    public void PostOrder(BinarySearchTreeNode root){
        //PostOrder -> LRD
        if(root!=null){
             PostOrder(root.getLeft());
             PostOrder(root.getRight());
            System.out.println(root.getData());
        }
    }


    public  BinarySearchTreeNode find(int item){
        //find node with the given item
         BinarySearchTreeNode current = root;
         while(current.getData()!=item)
         {
              if(item<current.getData())
                   current = current.getLeft();
              else
                   current = current.getRight();
              if(current==null)
                   return  null;
         }
         return current ;
    }
    public void insert(int id,int data){
        BinarySearchTreeNode node = new BinarySearchTreeNode();
        node.setId(id) ;
        node.setData(data);
        if(root==null)
        {
             root=node;
        }
        else
        {


            BinarySearchTreeNode current = root;
            BinarySearchTreeNode parent;
            while(true)
            {
                parent = current ;
                if(id>current.getId()){
                    // going left
                    current = current.getLeft();
                    if(current==null)
                    {
                         parent.setLeft(node);
                         return;
                    }
                }
                else {
                     current = current.getRight();
                      if(current == null){

                           parent.setRight(node);
                           return ;
                      }
                }

            }
        }
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(
                "......................................................");
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;

            for (int j = 0; j < nBlanks; j++)
                System.out.print(' ');

            while (globalStack.isEmpty() == false) {
                BinarySearchTreeNode temp = (BinarySearchTreeNode) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getData());
                    localStack.push(temp.getLeft());
                    localStack.push(temp.getRight());

                    if (temp.getLeft() != null || temp.getRight() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++)
                    System.out.print(' ');
            }  // end while globalStack not empty
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        }  // end while isRowEmpty is false
        System.out.println(
                "......................................................");
    }


}
