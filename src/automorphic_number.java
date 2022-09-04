//5=25
//6=36
//36=.....6
//etc i.e whose last digit same square of last digit


import java.util.Scanner;
public class automorphic_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        int count=0;
        int square=n*n;
        int t=n;
        while (t>0){
            count++;
            t/=10;
        }
        int last_digit=(int)(square%(Math.pow(10,count)));
        if(n==last_digit){
            System.out.println(n+" is an automorphic num");
        }
        else{
            System.out.println("no");
        }
    }
}