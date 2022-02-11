import java.util.Scanner;

class node001 {
    int data;
    node001 next;
    public node001(int data){
        this.data= data;
        this.next=null;
    }
}
public class circularlinkedlist {
    node001 head;

    public void insert(node001 newnode) {
        if (head == null) {
            head = newnode;
            newnode.next = newnode;
        } else {
            node001 t = head;
            while (t.next != head) {
                t = t.next;
            }
            newnode.next = t.next;
            t.next = newnode;
            head = newnode;  // this is added to insert at beginning
        }
    }

    public void insertatEnd(node001 newnode) {
        if (head == null) {
            head = newnode;
            newnode.next = newnode;
        } else {
            node001 t = head;
            while (t.next != head) {
                t = t.next;
            }
            newnode.next = t.next;
            t.next = newnode;
        }
    }

    public void display() {
        if (head != null){
            node001 t = head;
            while (t.next != head) {
                System.out.println(t.data);
                t = t.next;
            }
            System.out.println(t.data);
        }
    }

    public void deletefromEnd() {
        if (head == null) {
            System.out.println("Empty");
        } else {
            node001 t = head;
            if (t.next == head) {
                head = null;
            }
            while (t.next.next != head) {
                t = t.next;
            }
            t.next = head;
        }
    }
}
class SinglyCircularList{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        circularlinkedlist cll= new circularlinkedlist();
        while (true) {
            System.out.println("""
                    Enter your choice\s
                     1) To insert the node at beginning\s
                     2) to insert the node at end\s
                     3) To print the LinkedList1\s
                     4) to delete the node from end\s
                     5) exit""");
            System.out.println("Enter your choice");
            int c = sc.nextInt();
            switch (c) {
                case 1 -> cll.insert(new node001(sc.nextInt()));
                case 2 -> cll.insertatEnd(new node001(sc.nextInt()));
                case 3 -> cll.display();
                case 4 -> cll.deletefromEnd();
                case 5 -> System.exit(0);
            }
        }
    }
}