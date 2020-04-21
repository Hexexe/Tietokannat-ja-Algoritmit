package Tehtävä_6_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {
    private LinkedList<ListItem> list;

    public Stack() {
        list = new LinkedList<>();
    } // constructor

    public void push(String aData) { list.add(new ListItem(aData)); } // Muodosta uusi lista-alkio ja vie se pinon huipulle

    public ListItem pop() { return list.size() > 0 ? list.removeLast() : null; } // tarkista onko lista tyhjä. jos ei niin purge viimeinen listalta

    public int getSize() {
        return list.size();
    } // Palauta pinon koko

    public void printItems() {
        Iterator<ListItem> iterator = list.descendingIterator();
        while (iterator.hasNext()) System.out.println(iterator.next()); //Tulosta pinon sisältö muuttamatta pinoa
    }


}
