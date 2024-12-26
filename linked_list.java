package DSA;

import java.util.Scanner;

// wap to insert element at first in linked list.
public class linked_list {
    Node head;
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // to add the data on first position of link list.
    public void addfirst(String data) {
        Node newnode = new Node(data); 
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }
    // to add the data on last position of link list.
    public void addlast(String data) {
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }        
        Node currnode = head;
        while(currnode.next != null){
            currnode = currnode.next;
        }
        currnode.next = newnode;

    }
    // print the linklist...
    public  void printlist() {
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        Node currnode = head;
        while(currnode != null){
            System.out.print(currnode.data+ " ");
            currnode = currnode.next;
        }        
        System.out.println("Null");
    }

    public static void main(String[] args) {
        linked_list list = new linked_list();
        Scanner sc = new Scanner(System.in);
        int choice;
        do { 
            System.out.println("\n menu....");
            System.out.println("1. add data at beginning");
            System.out.println("2. add data at end");
            System.out.println("3. print the link list");
            System.out.println("4. exit");
            System.out.print("enter your choice:- ");
            choice =sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("enter the data:- ");
                    String dt = sc.nextLine();
                    list.addfirst(dt);
                    break;
                case 2:
                    System.out.println("enter the data:- ");
                    String d = sc.nextLine();
                    list.addlast(d);
                    break;
                case 3:
                    System.out.println("linked list is..");
                    list.printlist();
                    break;
                case 4:
                    System.out.println("exiting...");
                    break;
                default:
                    System.out.println("invalid choice..\n please enter vlid choice again....");
            }
        }while (choice != 4);
   }
}
