import java.util.Scanner;
public class Arm_strong_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = s.nextInt();


            int t, r=0, c = 0, sum = 0;
            t = n;
            while (t> 0) {
                t/= 10;
                c++;
            }
            t = n;
            while (t > 0) {
                r = t % 10;
                sum += (Math.pow(r, c));
                t= t / 10;
            }
            if (n== sum) {
                System.out.println("Yes!It is armstrong number");

        }
            else{
                System.out.println("No!it is not armstrong number");
            }
    }
}



//between the range
//import java.util.Scanner;
//public class Arm_strong_num {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter lwr value:");
//        int n1 = s.nextInt();
//        System.out.println("Enter hir value:");
//        int n2 = s.nextInt();
//        for (int n = n1; n <n2 + 1; n++) {
//
//
//            int t, r=0, c = 0, sum = 0;
//            t = n;
//            while (t> 0) {
//                t/= 10;
//                c++;
//            }
//            t = n;
//            while (t > 0) {
//                r = t % 10;
//                sum += (Math.pow(r, c));
//                t= t / 10;
//            }
//            if (n== sum) {
//                System.out.println(n);
//            }
//        }
//    }
//}