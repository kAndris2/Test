package main;

public class LinkedList {
    Node head;

    public void insert(String data) {
        Node node = new Node(data);

        if(head == null) {
            head = node;
        }
        else {
            setNext(node);
            setPrevious(node);
        }
    }

    private void setPrevious(Node node) {
        Node n = head;
        while(!n.next.equals(node)) {
           n = n.next;
        }
        node.previous = n;
    }

    private void setNext(Node node) {
        Node n = head;
        while(n.next != null) {
            n = n.next;
        }
        n.next = node;
    }

    public void show() {
        Node node = head;

        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void showData(Node node) {
        System.out.println(node.toString());
    }

    public Node getNode(String data) {
        Node node = head;
        while(node.next.data != data) {
            node = node.next;
        }
        return node.next;
    }
}
