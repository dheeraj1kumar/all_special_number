import java.util.Scanner;

public class square_root_of_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        double n=s.nextInt();
        double m=1/2;
        double Sqr_root=Math.pow(n,m);

        System.out.println(Sqr_root);


        //using sqrt method
       // System.out.println(Math.sqrt(n));
    }
}
