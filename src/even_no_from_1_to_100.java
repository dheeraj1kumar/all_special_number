import java.util.Scanner;

public class even_no_from_1_to_100 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1=s.nextInt();
        System.out.println("Enter 2nd number");
        int n2=s.nextInt();
        for(int n=n1;n<=n2;n++){
            if(n%2==0){
                System.out.printf("%d\t",n);
            }
        }
    }
}
