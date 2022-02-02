import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data= data;
        this.next=null;
    }
}
class singlylinkedlist{
    Node head;
    public void insertatBeg(Node newnode){
        if (head != null) {
            newnode.next = head;
        }
        head= newnode;
    }
    public void insertatEnd(Node newnode){
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void insertatPos(int pos,Node newnode){
        if(head==null){
            head=newnode;
        }
        else{
            Node temp= head;
            for (int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next= newnode;
        }
    }
    public void traverse(){
        if(head==null){
            System.out.println("No element Available");
        }
        else{
            Node temp= head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public void deletefrombeg(){
        if (head == null) {
            System.out.println("No element available");
        }
        else{
            head=head.next;
        }
    }
    public void deleteatLast(){
        if(head==null){
            head=null;
        }
        else {
            Node temp=head;
            Node prev=null;
            while (temp!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
        }
    }

}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singlylinkedlist sll = new singlylinkedlist();

        Node n1 = new Node(10);
        Node n2 = new Node(20);            // this is optional I have given the list before, or we can build it during runtime by scanner
        Node n3 = new Node(30);            // initialized linked list
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        sll.head = n1;
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
                case 1 -> sll.insertatBeg(new Node(sc.nextInt()));
                case 2 -> sll.insertatEnd(new Node(sc.nextInt()));
                case 3 -> sll.traverse();
                case 4 -> sll.insertatPos(sc.nextInt(), new Node(sc.nextInt()));
                case 5 -> sll.deletefrombeg();
                case 6 -> sll.deleteatLast();
                case 7 -> System.exit(1);
            }
        }

    }
}