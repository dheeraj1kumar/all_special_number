//neon number ex=9 i.e  9^2=81 = 8+1=9 same number if plus


import java.util.Scanner;

public class neon_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sqr,rem,sum=0;
        sqr=n*n;
        while(sqr>0){
            rem=sqr%10;
            sum+=rem;
            sqr/=10;
        }
        if (sum==n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
