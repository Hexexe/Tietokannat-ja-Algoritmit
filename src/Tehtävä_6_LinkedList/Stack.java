package Tehtävä_6_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {
    private LinkedList<ListItem> list;

    public Stack() {
        list = new LinkedList<>();
    }

    // Muodosta uusi lista-alkio ja vie se pinon huipulle
    public void push(String aData) {
        list.add(new ListItem(aData));
    }

    // tarkista onko lista tyhjä. jos ei niin purge viimeinen listalta
    public ListItem pop() {
        return list.size() > 0 ? list.removeLast() : null;
    }

    // Palauta pinon koko
    public int getSize() {
        return list.size();
    }

    //Tulosta pinon sisältö muuttamatta pinoa
    public void printItems() {
        Iterator<ListItem> iterator = list.descendingIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }


}
