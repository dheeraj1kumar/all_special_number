//import java.util.Scanner;
//public class strong_name {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int t;
//              int sum=0;
//        t=n;
//        while(t>0) {
//            int c = t % 10;
//            int f = 1;
//            for (int i = 1; i <=c; i++) {
//                f *= i;}
//            sum += f;
//
//            t/= 10;
//        }
//        if(sum==n){
//            System.out.println(n+" Strong number");
//
//        }
//        else{
//            System.out.println(n+" Not strong number");
//        }
//
//    }
//
//}


//in between range
import java.util.Scanner;
public class strong_name {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter lwr value:");
        int n1=s.nextInt();
        System.out.println("Enter hir value:");
        int n2=s.nextInt();
   for(int n=n1;n<n2+1;n++){
        int t;
        int sum=0;
        t=n;
        while(t>0) {
            int c = t % 10;
            int f = 1;
            for (int i = 1; i <=c; i++) {
                f *= i;}
            sum += f;

            t/= 10;
        }
        if(sum==n){
            System.out.println(n+" Strong number");

        }}}
}
