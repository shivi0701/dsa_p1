import java.util.Scanner;

class Nod{
    int data;
    Nod next;
    public Nod(int data){
        this.data= data;
        this.next=null;
    }
}
class singlylistprogram1 {
    Nod head;
    public void removeduplicate(){
        if(head==null){
            System.out.println("No element available");
        }
        else{
            Nod current= head;
            Nod temp;
            Nod dup;
            while(current!=null){
                temp= current;
                dup= current.next;
                while (dup!=null){
                    if(current.data==dup.data){
                        temp.next=dup.next;
                    }
                    else {
                        temp=dup;
                    }
                    dup=dup.next;
                }
                current=current.next;
            }
        }
    }
    public void display(){
        Nod current= head;
        if (head==null){
            System.out.println("No element available");
        }
        else {
            while (current!=null){
                System.out.println(current.data);
                current=current.next;
            }

        }
    }
}
class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singlylistprogram1 sll = new singlylistprogram1();

        Nod n1 = new Nod(10);
        Nod n2 = new Nod(20);
        Nod n3 = new Nod(10);
        Nod n4 = new Nod(40);
        Nod n5 = new Nod(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        sll.head = n1;
        sll.removeduplicate();
        sll.display();
    }
}