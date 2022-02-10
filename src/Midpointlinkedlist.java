import java.util.Scanner;

class Noe{
    int data;
    Noe next;
    public Noe(int data){
        this.data= data;
        this.next=null;
    }
}
public class Midpointlinkedlist {
    Noe head;
    Noe tail;
    int c=0;
    int[] l= new int[100];
    public void insert(Noe newfound){
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
    int x=0;
    public void midpont(){
        if(c==0);
        else if(c%2==0){
            Noe temp= head;
            for(int i=1;i<c/2;i++){
                temp= temp.next;
            }
            l[x++]= temp.data;
        }
        else{
            Noe t =head;
            for(int i=1;i<=c/2;i++){
                t=t.next;
            }
            l[x++]= t.data;
        }
    }
}
class Maino1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Midpointlinkedlist mll= new Midpointlinkedlist();
        System.out.println("Input the no. of testcases");
        int t = sc.nextInt();
        int i = 0;
        while (i < t) {
            while (mll.tail == null || mll.tail.data != -1) {
                mll.insert(new Noe(sc.nextInt()));
            }
            mll.midpont();
            mll.head=null;
            mll.tail=null;
            mll.c=0;
            i++;
        }
        for(int k=0;k<mll.x;k++){
            System.out.println(mll.l[k]);
        }
    }
}
