package Tehtävä_5_Iterator;

public class ListItem {

    private String data;

    public ListItem(String data) { this.data = data; }

    public String getData() { return data; }

    @Override
    public String toString() { return getData(); }
}
