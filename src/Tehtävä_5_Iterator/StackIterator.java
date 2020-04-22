package Tehtävä_5_Iterator;

interface Iterator {
    boolean hasNext();

    Object next();
}

public class StackIterator implements Iterator {

    private int top;
    private ListItem[] l;

    public StackIterator(Stack s) {
        top = s.size;
        l = s.a;
    }

    public boolean hasNext() { return top > 0; }

    public ListItem next() {
        top--;
        return l[top];
    }
}

