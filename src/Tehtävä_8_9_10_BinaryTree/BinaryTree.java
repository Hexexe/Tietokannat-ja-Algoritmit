/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tehtävä_8_9_10_BinaryTree;

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
        root.setHeight(Math.max(root.left() != null ? root.left().root.getHeight() + 1 : 0, root.right() != null ? root.right().root.getHeight() + 1 : 0));
    }

    public BinaryTree find(String aData) {
        if (root != null) {
            if (aData.equals(root.getData())) { return new BinaryTree(aData); }
            else if (aData.compareTo(root.getData()) < 0) { if (root.left() != null) return root.left().find(aData); }
            else if (aData.compareTo(root.getData()) > 0) { if (root.right() != null) return root.right().find(aData); }
        }
        return null;
    }

    // delete
    public BinaryTree purge(BinaryTree b, String data) {

        if(b == null) return null;
        if(b.find(data) == null) return null;
        if(data.compareTo(b.root.getData()) < 0) { b.root.setLeft(purge(b.root.left(), data)); }
        else if(data.compareTo(b.root.getData()) > 0) { b.root.setRight(purge(b.root.right(), data)); }
        else {
            if(b.root.left() == null && b.root.left() == null) { return null; } // ei lapsia
            else if(b.root.left() == null) { return b.root.right(); } // oikea (ei vasenta)
            else if(b.root.right() == null) { return b.root.left(); } // vasen (ei oikeaa)
            else { // molemmat lapset (pienin value)
                String minValue = minValue(b.root.right());
                b.root.setData(minValue);
                b.root.setRight(purge(b.root.right(), minValue));
            }
        }
        return b;
    }

    private String minValue(BinaryTree b) {
        if(b.root.left() != null) { return minValue(b.root.left()); }
        return b.root.getData();
    }

    public void preOrder() {
        if (root != null) {
            System.out.printf("Data: %s , Left Node: %s, Right Node: %s, Height: %d,\n", root.getData(), root.left() != null ? root.left().root.getData() : "None", root.right() != null ? root.right().root.getData() : "None", root.getHeight());
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }

    }

    public void setLeft(BinaryTree tree) { root.setLeft(tree); }
    public void setRight(BinaryTree tree) { root.setRight(tree); }
    public Node getRoot() { return root; }
    public void setRoot(Node root) { this.root = root; }
}
