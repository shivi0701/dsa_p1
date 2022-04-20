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
    public void deleteatEnd(){
        if (head != null) {
            Node1 temp = head;
            Node1 t= null;
            while (temp.next != null) {
                t = temp;
                temp = temp.next;
            }
            temp.prev=null;
            assert t != null;
            t.next = null;
        }
    }
    public void deleteatPos(int pos){
        if (head == null) {
            System.out.println("No element to delete");
        }
        if (pos == 0) {
            head = head.next;
            head.prev=null;
        } else {
            Node1 temp = head;
            for (int i = 1; i < pos - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
                System.out.println("No element to delete");
            } else {
                temp.next = temp.next.next;
                temp.next.prev= temp;
            }
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
    public void search(int ele) {
        Node1 temp = tail;
        int c = 0;
        while (temp != null) {
            if (temp.data == ele) {
                System.out.println("Element found");
                c = 1;
                break;
            }
            temp = temp.prev;
        }
        if (c == 0) {
            System.out.println("Element not found");
        }
    }
    public void sortasc() {
        Node1 one = head;
        while (one != null) {
            Node1 two = one.next;
            while (two != null) {
                if (one.data > two.data) {
                    int t = one.data;
                    one.data = two.data;
                    two.data = t;
                }
                two = two.next;
            }
            one = one.next;
        }
        System.out.println("List sorted");
    }
    public void sorted() {
        Node1 one = head;
        while (one != null) {
            Node1 two = one.next;
            while (two != null) {
                if (one.data < two.data) {
                    int t = one.data;
                    one.data = two.data;
                    two.data = t;
                }
                two = two.next;
            }
            one = one.next;
        }
        System.out.println("List sorted");
    }
    public void mergelists(Node1 l1,Node1 l2) {
        while (l1.next!=null){
            l1= l1.next;
        }
        l1.next=l2;
    }
}
class Main1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        doublylinkedlist dll= new doublylinkedlist();
        doublylinkedlist dll2= new doublylinkedlist();
        dll2.head= new Node1(5);
        dll2.insertatLast(new Node1(44));
        dll2.insertatLast(new Node1(3));
        dll2.insertatLast(new Node1(2));
        dll2.insertatLast(new Node1(1));
        dll2.insertatLast(new Node1(0));
        while (true) {
            System.out.println("""
                    Enter your choice\s
                     1) To insert at Beginning\s
                     2) to insert at last\s
                     3) to insert at specific position\s
                     4) To print the LinkedList1\s
                     5) to print the LinkedList2\s
                     6) to delete from beginning\s
                     7) to delete from last\s
                     8) to delete at specific position\s
                     9) to search an element\s
                     10) to sort in ascending order\s
                     11) to sort in descending order\s
                     12) to merge 2 linked lists\s
                     13) exit""");
            int c = sc.nextInt();
            switch (c) {
                case 1 -> dll.insertatBeg(new Node1(sc.nextInt()));
                case 2 -> dll.insertatLast(new Node1(sc.nextInt()));
                case 3 -> dll.insertPos(sc.nextInt(), new Node1(sc.nextInt()));
                case 4 -> dll.display();
                case 5 -> dll2.display();
                case 6 -> dll.deletefromBeg();
                case 7 -> dll.deleteatEnd();
                case 8 -> dll.deleteatPos(sc.nextInt());
                case 9 -> dll.search(sc.nextInt());
                case 10 -> dll.sortasc();
                case 11 -> dll.sorted();
                case 12 -> dll.mergelists(dll.head,dll2.head);
                case 13 -> System.exit(1);
            }
        }
    }
}