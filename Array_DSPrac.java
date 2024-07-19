import java.util.*;

class Array_DSPrac{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void creation(){

        int data, n;
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.print("Enter data : ");
            data = s.nextInt();

            Node new_node = new Node(data);

            if(head == null){
                head = new_node;
            }
            else{
                new_node.next = head;
                head = new_node;
            }

            System.out.println("To add more data press 1. ");
            n = s.nextInt();
        }
        while(n==1);
    }

    public void traversal(){

        Node temp = head;
        if(head == null){
            System.out.println("LinkedList does not exist.");
        }
        else{
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void insertion(){

        int data, n;
        Scanner sc = new Scanner(System.in);

        if(head == null){
            head = new_node;
        }
        else{

            System.out.println("Enter 1 to insert the item at the beginning.");
            System.out.println("Enter 2 to insert the item at the end.");
            System.out.println("Enter 3 to insert the item in the middle.");

            m = sc.nextInt();

            switch(m){
                case 1 : 
                    new_node = head;
                    head = new_node.next;
                    break;
                
                case 2 : 
                    Node temp = head;
                    while(temp != null){
                        temp = temp.next;
                    }
                    temp.next = new_node;
                    break;

                case 3 : 
                    System.out.print("Enter position to be inserted : ");
                    int p = sc.nextInt();
                    Node temp1 = head;

                    for(i=0)
            }
        }
    }

    public static void main(String[] args) {

        Array_DSPrac ll = new Array_DSPrac();
        ll.creation();
        ll.traversal();

    }
}