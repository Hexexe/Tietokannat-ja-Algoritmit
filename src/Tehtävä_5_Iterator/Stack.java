package Tehtävä_5_Iterator;

public class Stack {

    int size;
    ListItem[] a = new ListItem[10];

    public Stack() { size = 0; }

    //  palautetaan pino-iteraattori
    public StackIterator iterator() { return new StackIterator(this); }

    // muodostetaan uusi alkio ja viedään se huipulle
    public void push(String aData) {
        if (size == a.length) {
            System.out.println("Full");
        } else {
            a[size]= new ListItem(aData);
            size++;
        }
    }

    // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
    public ListItem pop() {
        if (size == 0) return null;
        ListItem r = a[size-1];
        size--;
        return r;
    }

    // palautetaan pinottujen alkioiden lukumäärä
    public int getSize() { return size; }
}

