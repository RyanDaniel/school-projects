package prog2.list.linkedlist;

class List {

  private Node head;

  public List() {
    head = null;
  }

  private class Node {

    private final int value;
    private Node next;

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

    public int getValue() {
      return value;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node next) {
      this.next = next;
    }

  }

}

public class LinkedList {

  public static void main(String[] args) {
    // TO DO
  }

}
