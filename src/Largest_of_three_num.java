//import java.util.Scanner;
//
//public class Largest_of_three_num {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter 1st number");
//        int n1=s.nextInt();
//        System.out.println("Enter 2nd number");
//        int n2=s.nextInt();
//        System.out.println("Enter 3rd number");
//        int n3=s.nextInt();
//        if(n1>n2&&n1>n3){
//            System.out.println(n1+" is greater");
//        }
//         else if (n2>n1&&n2>n3) {
//            System.out.println(n2+" is greater");
//
//        } else if (n3>n1&&n3>n2) {
//            System.out.println(n3+" is greater");
//
//        }
//         else{
//            System.out.println("invalid number");
//        }
//    }
//}


//using ternary operator:
import java.util.Scanner;

public class Largest_of_three_num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1=s.nextInt();
        System.out.println("Enter 2nd number");
        int n2=s.nextInt();
        System.out.println("Enter 3rd number");
        int n3=s.nextInt();
        int d;
        d=n3>(n1>n2?n1:n2)?n3 :((n1>n2)?n1:n2);
        System.out.println(d+" greater number");
    }
}
