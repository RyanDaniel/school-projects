package prog2.stack.linkedliststack;

class Stack {

  private Node top;

  public Stack() {
    top = null;
  }

  public boolean empty() {
    return top == null;
  }

  public void push(int value) {
    top = new Node(value, top);
  }

  public int peek() {
    return top.getValue();
  }

  public int pop() {
    int tmp = top.getValue();
    top = top.getNext();
    return tmp;
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

public class LinkedListStack {

  public static void main(String[] args) {
    // TO DO
  }

}
