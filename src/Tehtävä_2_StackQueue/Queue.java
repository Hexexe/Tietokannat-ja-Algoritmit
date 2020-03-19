package Tehtävä_2_StackQueue;

public class Queue {
    private ListItem head, tail;
    private int size;

    public Queue() {
        size = 0;
        head = tail = null;
    }

    // Muodosta uusi lista-alkio ja vie se jonon loppuun
    public void push(String aData) {
        ListItem listItem = new ListItem(aData);
        if (isEmpty()) {
            head = listItem;
        } else {
            tail.setNext(listItem);
        }
        tail = listItem;
        size++;
    }

    //Poista ja palauta alkio jonon alusta
    // jos jono tyhjä palauta null
    public ListItem pop() {
        try {
            ListItem listItem = head;
            head = head.getNext();
            size--;
            if (isEmpty()) {
                tail = null;
            }
            return listItem;
        } catch (Exception e) {
            return null;
        }
    }

    //Tulosta jonon sisältö muuttamatta pinoa
    public void printItems() {
        ListItem listItem = head;
        System.out.print("Head: ");
        while (listItem != null) {
            System.out.print(listItem.getData() + "-->");
            listItem = listItem.getNext();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Palauta jonon koko
    public int getSize() {
        return size;
    }
}
