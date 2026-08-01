//1.
// import java.util.*;
// public class LinkedList {
// public static void main(String[]args){
//   Node node1=new Node();             //creating a node
//   Node node2=new Node();
//   node1.value=1;
//   node2.value=2;
//   node1.next=node2;
//   node2.next=null;

//   Node temp=node1;                   //creating a temporary node to traverse the linked list

//    System.out.println(node1.value);    //printing the value of node1

//    while(temp!=null){
//     System.out.print(temp.value+" ");    //printing the value of the node
//     temp=temp.next;                      //moving to the next node
//    }

// }
    
// }
// class Node{
//     public int value;         //value of the node
//     public Node next;         //pointer to the next node


//     // Node(int value){
//     //     this.value=value;     //constructor to initialize the value of the node
        
//     // }
// }


//2.

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2); // O(n)
        linkedList.addLast(4); // O(1)
        linkedList.addFirst(0); // O(1)
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}