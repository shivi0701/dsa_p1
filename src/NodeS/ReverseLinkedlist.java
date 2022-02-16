package NodeS;

import java.util.Scanner;

public class ReverseLinkedlist {
    nodes head;
    nodes tail;
    int c=0;
    int [] arr= new int[1000];
    public void insert(nodes newfound){
        if (newfound.data != -1) {
            if (head == null) {
                head =tail= newfound;
            } else {
                tail.next = newfound;
                tail=newfound;
            }

            c++;
        }
        else {
            tail = newfound;
            tail.data = -1;

        }
    }
    public void reverse(){
        int k=0;
        nodes temp= head;
        while (temp!=null){
            arr[c-k]= temp.data;
            temp=temp.next;
            k++;
        }
        for (int j=1;j<k+1;j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
class M{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ReverseLinkedlist rll= new ReverseLinkedlist();
        System.out.println("Input the no. of testcases");
        int t = sc.nextInt();
        int i = 0;
        while (i < t) {
            while (rll.tail == null || rll.tail.data != -1) {
                rll.insert(new nodes(sc.nextInt()));
            }
            rll.reverse();
            rll.head = null;
            rll.tail = null;
            rll.c = 0;
            i++;
        }
    }
}