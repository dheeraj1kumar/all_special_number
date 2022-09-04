import java.util.Scanner;
public class reverse_num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int rev=0,c;
        int t=n;
        while(t>0) {
            c = t % 10;
            rev = rev * 10 + c;
            t/= 10;
        }
            System.out.println(rev);

    }
}
