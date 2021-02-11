package main;

public class Node {
    String data;
    Node previous;
    Node next;

    public Node(String data) {
        this.data = data;
        next = null;
        previous = null;
    }

    private String getPrev() {
        return previous == null ? "null" : previous.data;
    }

    private String getNext() {
        return next == null ? "null" : next.data;
    }

    @Override
    public String toString() {
        return getPrev() + " - " + data + " - " + getNext();
    }
}
