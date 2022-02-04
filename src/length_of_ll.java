import java.util.Scanner;

class No {
    int data;
    No next;

    public No(int data) {
        this.data = data;
        this.next = null;
    }
}
public class length_of_ll {
    No head;
    No tail;
    int[] s= new int[100];
    int c=0;
    int k=0;
    public void insertatEnd(No newnode) {

        if (newnode.data != -1) {
            if (head == null) {
                head = newnode;
            } else {
                tail.next = newnode;
            }
            tail = newnode;
            c++;
        }
        else {
            tail = newnode;
            tail.data = -1;

        }
    }
    public void countelement(){
        s[k++]=c;
    }
}
class M01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        length_of_ll lll = new length_of_ll();
        System.out.println("Input the no. of testcases");
        int t = scanner.nextInt();
        int i = 0;
        while (i < t) {
            while (lll.tail == null || lll.tail.data != -1) {
                lll.insertatEnd(new No(scanner.nextInt()));
            }
            lll.countelement();
            lll.head=null;
            lll.tail=null;
            lll.c=0;
            i++;
        }
        for (int j = 0; j < lll.k; j++) {
            System.out.println(lll.s[j]);
        }
    }
}
