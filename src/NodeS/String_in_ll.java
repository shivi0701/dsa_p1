package NodeS;

import java.util.Scanner;

public class String_in_ll{
    nodes head;

    public void print(char[] arr){
        for (char c : arr) {
            nodes n = new nodes(c);
            if (head == null) {
                head = n;
            } else {
                nodes temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = n;
            }
            n.Data = c;
        }
        if(head==null){
            System.out.println("No element Available");
        }
        else{
            nodes temp= head;
            while(temp.next!=null){
                System.out.print(temp.Data+"->");
                temp=temp.next;
            }
            System.out.println(temp.Data);
        }
    }

}
class main000{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        char[] arr= str.toCharArray();
        String_in_ll sll= new String_in_ll();
        sll.print(arr);
    }
}