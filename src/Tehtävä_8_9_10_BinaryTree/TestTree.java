package Tehtävä_8_9_10_BinaryTree;

import org.junit.Test;

public class TestTree {

    @Test
    public void test() {
        BinaryTree b = new BinaryTree();

        b.insert("6");
        b.insert("4");
        b.insert("3");
        b.insert("5");
        b.insert("8");
        b.insert("7");
        b.insert("9");
        System.out.println("Alkuperäiset luvut");
        b.preOrder();
        System.out.println("Poiston jälkeen");
        b.purge(b, "8");
        b.preOrder();
    }

}
