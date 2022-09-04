//HCF of two number

//import java.util.Scanner;
//
//public class GCD_AND_LCM {
//    public static void main(String[] args) {
//        int gcd=0;
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter the first number:");
//        int n1=s.nextInt();
//        System.out.println("enter the 2nd number:");
//        int n2=s.nextInt();
//        for(int i=1;i<=n1&& i<=n2;i++) {
//            if (n1 % i == 0 && n2 % i == 0) {
//                gcd = i;
//
//                System.out.printf("The HCF of %d and %d is %d", n1, n2, gcd);
//            }
//        }
//    }
//}



//for LCM
import java.util.Scanner;

public class GCD_AND_LCM {
    public static void main(String[] args) {
        int gcd=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number:");
        int n1=s.nextInt();
        System.out.println("enter the 2nd number:");
        int n2=s.nextInt();
        for(int i=1;i<=n1&& i<=n2;++i) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }}
                int LCM = (n1 * n2) / gcd;


                System.out.printf("The LCM of %d and %d is %d", n1, n2, LCM);


        }
}