//sunny number ex==  3,8,15,35,24....    3+1=4 is perfect square



//import java.util.Scanner;
//
//public class sunny_number {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int n=s.nextInt();
//        //for (int i=0;i<=n;i++)
//        if (Math.sqrt(n+1)%1==0){
//            System.out.println(n+" yes! this number is sunny number");
//        }
//        else{
//            System.out.println(n+" no! this no is not sunny number");
//        }
//
//    }
//}



//in between range
import java.util.Scanner;

public class sunny_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1 number:");
        int n1=s.nextInt();
        System.out.println("Enter the 2 number:");
        int n2=s.nextInt();
        for (int n=n1;n<=n2;n++)
        if (Math.sqrt(n+1)%1==0){
            System.out.println(n);

        }

    }
}