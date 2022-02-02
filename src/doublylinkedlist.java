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
                     2) To insert at last\s
                     3) To print the LinkedList\s
                     4) To insert at specific position\s
                     5) to delete from beginning\s
                     6) to delete from last\s
                     
                     7) exit""");
            System.out.println("Enter your choice");
            int c = sc.nextInt();
            switch (c) {
               // case 1 -> dll.i
                case 2 -> dll.insertatLast(new Node1(sc.nextInt()));
                case 3 -> dll.display();
               // case 4 -> sll.insertatPos(sc.nextInt(), new Node(sc.nextInt()));
                case 5 -> dll.deletefromBeg();
               // case 6 -> sll.deleteatLast();
                case 7 -> System.exit(1);
            }
        }
    }
}