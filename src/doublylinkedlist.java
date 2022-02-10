import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    Node1 prev;
    public Node1(int data){
        this.data= data;
        this.next=null;
        this.prev=null;
    }
}
public class doublylinkedlist {
    Node1 head;
    Node1 tail;
    public void insertatBeg(Node1 newnode){
        if(head==null){
            head=tail=newnode;
            head.prev=null;
            tail.next=null;
        }
        else{
            head.prev= newnode;
            newnode.next=head;
            newnode.prev=null;
            head= newnode;
        }
    }
    public void insertatLast(Node1 newnode){
        if(head==null){
            head= newnode;
        }
        else {
            Node1 temp= head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.prev=temp;
        }
    }
    public void insertPos(int pos,Node1 newnode){
        if(head==null){
            head=newnode;
        }
        else {
            Node1 temp= head;
            for (int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            newnode.prev= temp;

        }
    }
    public void deletefromBeg(){
        if(head==null){
            System.out.println("No element available");
        }
        else {
            head=head.next;
            head.prev=null;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("No element Available");
        }
        else{
            Node1 temp= head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
class Main1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        doublylinkedlist dll= new doublylinkedlist();
        while (true) {
            System.out.println("""
                    Enter your choice\s
                     1) To insert at Beginning\s
                     2) to insert at last\s
                     3) to insert at specific position\s
                     4) To print the LinkedList\s
                     5) to delete from beginning\s
                     6) to delete from last\s
                     7) to 
                     8) exit""");
            System.out.println("Enter your choice");
            int c = sc.nextInt();
            switch (c) {
                case 1 -> dll.insertatBeg(new Node1(sc.nextInt()));
                case 2 -> dll.insertatLast(new Node1(sc.nextInt()));
                case 3 -> dll.insertPos(sc.nextInt(), new Node1(sc.nextInt()));
                case 4 -> dll.display();
                case 5 -> dll.deletefromBeg();
               // case 6 -> sll.deleteatLast();
                case 8 -> System.exit(1);
            }
        }
    }
}