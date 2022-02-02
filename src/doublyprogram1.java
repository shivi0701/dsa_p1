import java.util.Scanner;

class Nodee{
    int data;
    Nodee next;
    Nodee prev;
    public Nodee(int data){
        this.data= data;
        this.next=null;
        this.prev=null;
    }
}

public class doublyprogram1 {
    Nodee head;
    public void insert(Nodee newnode){
        if(head==null){
            head=newnode;
            newnode.prev=null;
            newnode.next= null;
        }
        else{
            Nodee temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void checkPrime(){

        Nodee current= head;
        while(current!=null){
            Nodee prime=current;
            int flag=0;
            if(prime.data<=1){
                prime.next=current.next;
                continue;
            }
            else {
                for(int i=2;i<=prime.data/2;i++){
                    if (prime.data % i == 0) {
                        flag=1;
                        break;
                    }
                }
                if(flag==0) {
                    System.out.println(current.data);
                }
            }
            current=current.next;

        }
    }

    public  void display(){
        if(head==null){
            System.out.println("No element available");
        }
        else {
            Nodee temp= head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
class Main001{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        doublyprogram1 dl= new doublyprogram1();
        while (true){
            System.out.println("Enter your choice\n 1. to input the newnode\n 2. to fetch all no.prime\n 3. to display the linked list\n 4. to exit");
            int c= sc.nextInt();
            switch (c){
                case 1-> dl.insert(new Nodee(sc.nextInt()));
                case 2-> dl.checkPrime();
                case 3-> dl.display();
                case 4-> System.exit(0);
            }
        }
    }
}
