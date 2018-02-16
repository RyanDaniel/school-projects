package prog2.list.linkedlist;

class List {

  private Node head;

  public List() {
    head = null;
  }

  public boolean empty() {
    return head == null;
  }

  public boolean contains(int value) {
    Node tmp = head;
    while(tmp != null) {
      if(tmp.getValue() == value) {
        return true;
      }
      tmp = tmp.getNext();
    }
    return false;
  }

  public boolean addFirst(int value) {
    if(contains(value)) {
      return false;
    }
    head = new Node(value, head);
    return true;
  }

  public boolean addLast(int value) {
    if(contains(value)) {
      return false;
    }
    Node tmp = head;
    while(tmp.getNext() != null) {
      tmp = tmp.getNext();
    }
    tmp.setNext(new Node(value, null));
    return true;
  }

  public boolean remove(int value) {
    if(!contains(value)) {
      return false;
    }
    if(head.getValue() == value) {
      head = head.getNext();
      return true;
    } else {
      Node tmp = head;
      while(tmp != null) {
        if(tmp.getNext().getValue() == value) {
          tmp.setNext(tmp.getNext().getNext());
          return true;
        }
        tmp = tmp.getNext();
      }
    }
    return false;
  }

  @Override
  public String toString() {
    String out = "[";
    Node tmp = head;
    while(tmp != null) {
      out += tmp.getValue();
      if(tmp.getNext() != null) {
        out += ", ";
      }
      tmp = tmp.getNext();
    }
    return out + "]";
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
