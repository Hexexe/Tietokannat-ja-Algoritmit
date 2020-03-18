package Tehtävä_1_StackProject;

public class Stack {
    private ListItem top;
    private int size;

    public Stack() {
        top = null;
    }

    // Muodosta uusi lista-alkio ja vie se pinon huipulle
    public void push(String aData) {
        ListItem listItem = new ListItem();
        listItem.setData(aData);
        listItem.setNext(top);
        top = listItem;
        size++;
    }

    //Poista ja palauta alkio pinon huipulta
    // jos pino tyhjä palauta null
    public ListItem pop() {
        try {
            ListItem listItem = top;
            top = top.getNext();
            size--;
            return listItem;
        } catch (Exception e) {
            return null;
        }
    }

    //Tulosta pinon sisältö muuttamatta pinoa
    public void printItems() {
        ListItem listItem = top;
        while (listItem != null) {
            System.out.print(listItem.getData() + "->");
            listItem = listItem.getNext();
        }
    }

    // Palauta pinon koko
    public int getSize() {
        return size;
    }
}
