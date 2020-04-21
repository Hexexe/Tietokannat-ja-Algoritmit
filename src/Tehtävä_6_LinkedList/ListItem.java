package Tehtävä_6_LinkedList;

public class ListItem {

    private String data;

    public ListItem(String data){ this.data = data; }

    public String getData() {
        return data;
    }
    public void setData(String data) { this.data = data; }
    @Override
    public String toString() { return data; }
}
