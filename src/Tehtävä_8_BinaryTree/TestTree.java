package Tehtävä_8_BinaryTree;

import org.junit.Test;

public class TestTree {

    @Test
    public void test(){
        BinaryTree b = new BinaryTree();
        b.insert("aaaaaa");
        b.insert("aaaa");
        b.insert("aaa");
        b.insert("aaaaa");
        b.insert("aaaaaaaaaa");
        b.insert("aaaaaaaaa");
        b.insert("aaaaaaaaaaa");
        b.preOrder();
    }

}
