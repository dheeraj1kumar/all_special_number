//Simple calculator using Switch case

//package cal;
//import java.util.Scanner;
//public class calculator {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        int n1= s.nextInt();
//        System.out.println("Enter the 2nd number:");
//        int n2= s.nextInt();
//        System.out.println("enter the symbol:- +,-,*,/");
//        String sy=s.next();
//        int res;
//        switch (sy){
//            case "+":res=n1+n2;
//                System.out.println("Sum of two number:"+res);
//                break;
//            case "-":res=n1-n2;
//                System.out.println("sub of two number:"+res);
//                break;
//            case "*":res=n1*n2;
//                System.out.println("multiply of two number:"+res);
//                break;
//            case "/":res=n1/n2;
//                System.out.println("division of two number:"+res);
//                break;
//            default:
//                System.out.println("invalid of two number:");
//                break;
//            }
//        }
//
//
//    }


//Using do while loop
package cal;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        String yn;

        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int n1 = s.nextInt();
            System.out.println("Enter the 2nd number:");
            int n2 = s.nextInt();
            System.out.println("enter the symbol:- +,-,*,/");
            String sy = s.next();
            int res;
            switch (sy) {
                case "+":
                    res = n1 + n2;
                    System.out.println("Sum of two number:" + res);
                    break;
                case "-":
                    res = n1 - n2;
                    System.out.println("sub of two number:" + res);
                    break;
                case "*":
                    res = n1 * n2;
                    System.out.println("multiply of two number:" + res);
                    break;
                case "/":
                    res = n1 / n2;
                    System.out.println("division of two number:" + res);
                    break;
                default:
                    System.out.println("invalid symbol:");
                    break;
            }
            System.out.println("Do you want to continue (Press y for Yes and n for No:");
            yn=s.next();
        } while(yn.equals("y")||yn.equals("Y"));
    }


}


