import java.util.Scanner;

public class merge_arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of 1st array");
        int n= sc.nextInt();
        System.out.println("Enter size of 2nd array");
        int m= sc.nextInt();
        int[] a= new int[n];
        int[] b= new int[m];
        int[] c= new int[n+m];
        System.out.println("Enter elements of 1st array");
       for (int i=0;i<n;i++){
           a[i]= sc.nextInt();
       }
        System.out.println("Enter elements of 2nd array");
        for (int i=0;i<m;i++){
            b[i]= sc.nextInt();
        }

        int i =0;
        while (i<(n+m)){
            if(i<n){
                c[i]=a[i];
            }
            else {
                c[i]= b[i-n];
            }
            System.out.println(c[i]);
            i++;
        }
    }
}
