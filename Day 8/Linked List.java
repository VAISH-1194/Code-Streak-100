import java.util.*;


public class Main 
{
  public static void main(String[] args) 
  {
      LinkedList list = new LinkedList();
      list = list.insert(list,11);
      list = list.insert(list,9);
      list = list.insert(list,4);
      list = list.insert(list,20);
      
      list.display(list);
      list.sumLL(list);
      list.reverse(list);
      list.display(list);
  }
}

class LinkedList{
  Node head;

  static class Node{
  int data;
  Node next;
  
  Node(int data)
  {
    this.data = data;
    this.next = null;
  }
}
  
  public static LinkedList insert(LinkedList list, int data)
  {
    Node newNode = new Node(data);
    if(list.head == null)
    {
      list.head = newNode;
    }
    else
    {
      Node temp = list.head;
      while(temp.next != null)
        temp = temp.next;
      temp.next =  newNode;
      // while(temp != null)  //to arrive to the last node
      //   temp = temp.next;
    }
    
    return list;
  }
  
  public static void display(LinkedList list)
  {
    Node temp = list.head;
    System.out.println();
     System.out.println("Original : ");
    while(temp != null)
    {
      System.out.print(temp.data+" -> ");
      temp = temp.next;
    }
    
    System.out.println("NULL");
  }
  
  public static void sumLL(LinkedList list)
  {
    Node temp = list.head;
    int sum = 0;
    while(temp != null)
    {
      sum += temp.data;
      temp = temp.next;
    }
    
    System.out.println();
    System.out.println("Sum is : "+sum);
  }
  
  // public static void reverse(LinkedList list)   
  // {     
  //   Node prev = null;
  //   Node current = list.head;
  //   Node next = null;
    
  //   while(current != null) {
  //     next = current.next;
  //     current.next = prev;
  //     prev = current;
  //     current = next;
  //   }
    
  //   list.head = prev;
  //   System.out.println("Reversed : ");
    
  //   Node temp = list.head;
  // while (temp != null) {
  //   System.out.print(temp.data + " -> ");
  //   temp = temp.next;
  // }
  // System.out.println("NULL");
  // }
  
  
  public static void reverse(LinkedList list)
  {
    Stack<Integer> stack = new Stack<>();
    Node temp = list.head;
    
    while(temp != null)
    {
      stack.push(temp.data);
      temp = temp.next;
    }
    
    System.out.println();
    System.out.println("Reversed : ");
    
    while(!stack.empty())
      System.out.print(stack.pop()+" -> ");
      
    System.out.println("NULL");
  }
}
