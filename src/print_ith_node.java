import java.util.Scanner;

class Nod1{
    int data;
    Nod1 next;
    public Nod1(int data){
        this.data= data;
        this.next=null;
    }
}
public class print_ith_node {
    Nod1 head;
    Nod1 tail;
    int c = 0;
    int k=0;
    int[] s =new int[1000];

    public void insertatEnd(Nod1 newnode) {
        if (newnode.data != -1) {
            if (head == null) {
                head = newnode;
            }
            else {
                tail.next = newnode;
            }
            tail = newnode;
            c++;
        } else {
            tail = newnode;
            tail.data = -1;

        }
    }

    public void Printatpos(int pos) {

        Nod1 temp = head;
        if (pos < c) {
            for (int i = 1; i <= pos; i++) {
                temp = temp.next;
            }
            s[k++]=temp.data;
        }
    }
}
class singlyProgram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print_ith_node pin = new print_ith_node();
        System.out.println("Input the no.of testcases");
        int t = sc.nextInt();
        int i = 0;
        while (i < t) {
            while (pin.tail == null || pin.tail.data != -1) {
                pin.insertatEnd(new Nod1(sc.nextInt()));
            }
            System.out.println("Enter the position ");
            int p = sc.nextInt();
            pin.Printatpos(p);
            pin.head = null;
            pin.tail = null;
            i++;
        }
        for (int j=0;j<pin.k;j++){
            System.out.println(pin.s[j]);
        }
    }
}