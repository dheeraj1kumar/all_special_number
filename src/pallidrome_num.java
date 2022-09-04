import java.util.Scanner;
public class pallidrome_num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int t=n;
        int rev=0,c;

               while(t>0){
                c=   t%10;
                   t/=10;
                   rev=rev*10+c;
               }
               if (rev==n){
                   System.out.println("yes! it is palindrome number");
               }
               else{
                   System.out.println("no! it is not palindrome number");
               }
    }
}

//in between range
//
//import java.util.Scanner;
//public class pallidrome_num {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the lwr number:");
//        int n1=s.nextInt();
//        System.out.println("Enter the hir number:");
//        int n2=s.nextInt();
//int t1=0;
//
//
//               for(int n=n1;n<n2+1;n++) {
//
//
//                   int rev=0,c;
//                   t1=n;
//
//                   while (t1> 0) {
//                       c = t1 % 10;
//                       t1/= 10;
//
//                       rev = rev * 10 + c;
//
//
//                   }
//                   if (n==rev) {
//                       System.out.println(n);
//                   }
//               }
//    }
//}
