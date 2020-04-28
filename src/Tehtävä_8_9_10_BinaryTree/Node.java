/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tehtävä_8_9_10_BinaryTree;

/**
 *
 * @author kamaj
 */
public class Node {
    private String data;
    private BinaryTree left;
    private BinaryTree right;
    private int height;

    public Node(String value) {
        data = value;
        left = right = null;
    }
    public Node (String value, BinaryTree left, BinaryTree right) {
        data = value;
        this.left = left;
        this.right = right;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) { this.data = data; }
    public BinaryTree left() {
        return left;
    }
    public BinaryTree right() {
        return right;
    }
    public void setLeft(BinaryTree tree) {
        left = tree;
    }
    public void setRight(BinaryTree tree) {
        right = tree;
    }
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    @Override
    public String toString() { return data; }
}
