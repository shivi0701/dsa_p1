package NodeS;

import java.util.Scanner;

public class palindrome_linkedlist {
    nodes head;
    nodes tail;
    int c=0;
    public void insert(nodes newfound){
        if (newfound.data != -1) {
            if (head == null) {
                head = newfound;
            } else {
                tail.next = newfound;
            }
            tail = newfound;
            c++;
        }
        else {
            tail = newfound;
            tail.data = -1;

        }
    }
    public boolean check(){
        nodes temp= head;
        boolean flag=true;
        for(int i=0;i<c/2;c++){
            if(temp.data== tail.data){
                continue;
            }

        }
        return flag;
    }

}
class Palindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        palindrome_linkedlist pll= new palindrome_linkedlist();
        System.out.println("Input the no. of testcases");
        int t = sc.nextInt();
        int i = 0;
        while (i < t) {
            while (pll.tail == null || pll.tail.data != -1) {
                pll.insert(new nodes(sc.nextInt()));
            }
        }
    }
}
