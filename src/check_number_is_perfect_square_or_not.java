import javax.swing.*;
import java.util.Scanner;

public class check_number_is_perfect_square_or_not {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=s.nextInt();
        for (int i=1;i*i<=n;i++)
            if((n%i==0)&&(n/i==i)){

               // return;
                System.out.println("yes");
            }

            else{
                System.out.println("no");
            }

    }
}
