import java.util.Scanner;
//public class prime_number {
//    public static void main(String[] args) {
//
//
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int c = 0;
//        for (int i = 2; i <= n/2; i++) {
//            if(n%i==0){
//                c=1;
//                break;}
//
//            }
//        if(c==1|| n==1) {
//            System.out.println(n + " is not prime number");
//        }
//        else{
//            System.out.println(n+" is prime number");
//
//        }
//
//    }
//}

//By while loop
//public class prime_number {
//    public static void main(String[] args) {
//
//
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int c = 0;
//        int i=1;
//        while (n >= i) {
//            if (n % i == 0) {
//                c += 1;}
//                i += 1;
//
//        }
//        if (c == 2) {
//            System.out.println("yes prime number");
//        } else {
//            System.out.println("not prime number");
//        }
//    }
//}


//between range prime number
public class prime_number {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter lwr number:");
        int n1 = s.nextInt();
        System.out.println("Enter hir number:");

        int n2 = s.nextInt();


         int i;
        for (int n = n1; n <= n2; n++){
            for (i = 2; i <= n; i++) {
                if (n % i == 0) {
                    break;

                }}

                    if(n==i){
                    System.out.println(i);}}


            }}






