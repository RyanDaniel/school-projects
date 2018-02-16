package prog2.stack.arraystack;

class Stack {

  private int top;
  private final int[] data;

  public Stack() {
    top = 0;
    data = new int[20];
  }

  public boolean empty() {
    return top == 0;
  }

  public void push(int i) {
    data[top++] = i;
  }

  public int peek() {
    return data[top - 1];
  }

  public int pop() {
    return data[--top];
  }

}

public class ArrayStack {

  public static void main(String[] args) {
    // TO DO
  }

}
