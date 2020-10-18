import java.util.*;

class MyStack<Item>{
    private Node first;
    private int n;
    private class Node{
        Item data;
        Node next;
    }

    public void push(Item item){
        Node old = first;
        first = new Node();
        first.data=item;
        first.next=old;
        n++;
    }

    public Item pop(){
        Item item = first.data;
        first=first.next;
        n--;
        return item;
    }

    public Item top(){
        return first.data;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }


}

public class Main{
    public static void main(String[] args){
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(Integer.valueOf(1));
        stack.push(Integer.valueOf(2));
        stack.push(Integer.valueOf(3));
    }
}