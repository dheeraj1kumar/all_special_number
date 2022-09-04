import java.util.Scanner;
//public class perfect_number {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter the number:");
//        int n=s.nextInt();
//        int sum=0;
//    for(int i=1;i<=n/2;i++){
//        if(n%i==0){
//            sum+=i;
//        }}
//        if(sum==n){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//
//    }
//    }
//}

public class perfect_number {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter lwr number:");
        int n1 = s.nextInt();
        System.out.println("Enter hir number:");

        int n2 = s.nextInt();


        int sum=0;
        for (int n = n1; n <= n2; n++) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n) {
                System.out.println(n);
            }
        }}}

