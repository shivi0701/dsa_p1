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
    public void deleteatPos(int pos){
        if(head==null){
            System.out.println("No element to delete");
        }
        if(pos==0){
            head=head.next;
        }
        else {
            Node temp=head;
            for (int i=1;i<pos-1 && temp!=null;i++){
                temp=temp.next;
            }
            if(temp==null || temp.next==null){
                System.out.println("No element to delete");
            }
            temp.next= temp.next.next;
        }
    }
    public void sortasc(){
        Node one= head;
        while (one!=null){
            Node two= one.next;
            while (two!=null){
                if(one.data>two.data){
                    int t= one.data;
                    one.data= two.data;
                    two.data=t;
                }
                two=two.next;
            }
            one=one.next;
        }
    }
    public void sortdesc(){
        Node one= head;
        while (one!=null){
            Node two= one.next;
            while (two!=null){
                if(one.data<two.data){
                    int t= one.data;
                    one.data= two.data;
                    two.data=t;
                }
                two=two.next;
            }
            one=one.next;
        }
    }

    public void mergelists(Node l1,Node l2) {
        Node result = null;
        while(l1 != null || l2 != null) {
            int minVal;
            if (l1 == null) {
                minVal = l2.data;
                l2 = l2.next;
            } else if (l2 == null) {
                minVal = l1.data;
                l1 = l1.next;
            } else if(l1.data <= l2.data) {
                minVal = l1.data;
                l1 = l1.next;
            } else {
                minVal = l2.data;
                l2 = l2.next;
            }

            if(result == null) {
                result = head = new Node(minVal);
            } else {
                result.next = new Node(minVal);
                result = result.next;
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singlylinkedlist sll = new singlylinkedlist();
        singlylinkedlist sll2= new singlylinkedlist();
        sll2.insertatEnd(new Node(1));
        sll2.insertatEnd(new Node(2));
        sll2.insertatEnd(new Node(3));
        sll2.insertatEnd(new Node(4));
        sll2.insertatEnd(new Node(5));
        sll2.insertatEnd(new Node(6));
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
                     3) To print the LinkedList1\s
                     4) to print the Linkedlist2\s
                     5) To insert at specific position\s
                     6) to delete from beginning\s
                     7) to delete from last\s
                     8) to delete from specific position\s
                     9) to sort in ascending order\s
                     10) to sort in descending order\s
                     11) merge 2 lists\s
                     12) exit""");
            System.out.println("Enter your choice");
            int c = sc.nextInt();
            switch (c) {
                case 1 -> sll.insertatBeg(new Node(sc.nextInt()));
                case 2 -> sll.insertatEnd(new Node(sc.nextInt()));
                case 3 -> sll.traverse();
                case 4 -> sll2.traverse();
                case 5 -> sll.insertatPos(sc.nextInt(), new Node(sc.nextInt()));
                case 6 -> sll.deletefrombeg();
                case 7 -> sll.deleteatLast();
                case 8 -> sll.deleteatPos(sc.nextInt());
                case 9 -> sll.sortasc();
                case 10 -> sll.sortdesc();
                case 11 -> sll.mergelists(sll2.head,sll.head);
                case 12 -> System.exit(1);
            }
        }

    }
}