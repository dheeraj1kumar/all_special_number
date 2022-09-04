import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit where we want to print fibonacci series: ");
        int n=s.nextInt();
       int a=0,b=1,c;
       while(a<n){
           c=a+b;
           a=b;
           b=c;
           System.out.printf("%d\t ",a);
       }
    }

}
