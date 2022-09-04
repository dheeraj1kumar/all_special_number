import java.util.Scanner;
public class factorial_num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=s.nextInt();
      int  f=1;
        for(int i=1;i<=n;i++){
            f*=i;


        }
        System.out.printf("Factorial of %d is %d",n,f);
    }
}
