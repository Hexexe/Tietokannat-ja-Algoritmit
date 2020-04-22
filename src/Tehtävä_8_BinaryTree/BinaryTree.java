/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tehtävä_8_BinaryTree;

/**
 * @author kamaj
 */
public class BinaryTree {

    private Node root;

    public BinaryTree(String rootValue) {
        root = new Node(rootValue);
    }

    public BinaryTree() {
        root = null;
    }
    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */

    public void insert(String aData) {
        Node nodeToAdd = new Node(aData);
        if (root == null) root = nodeToAdd;
        if (aData.compareTo(root.getData()) < 0) {
            if (root.left() == null) setLeft(new BinaryTree(aData));
            else root.left().insert(aData);
        }
          if (aData.compareTo(root.getData()) > 0) {
            if (root.right() == null) setRight(new BinaryTree(aData));
            else root.right().insert(aData);
        }
    }

    public BinaryTree find(String aData) {
            if(root != null) {
                if (aData.equals(root.getData())) { return new BinaryTree(aData); }
                else if (aData.compareTo(root.getData()) < 0) { if (root.left() != null) return root.left().find(aData); }
                else if (aData.compareTo(root.getData()) > 0) { if (root.right() != null) return root.right().find(aData); }
            }
        return null;
    }



    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData() + ',');
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }

    }

    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
}
