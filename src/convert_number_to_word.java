import java.util.Scanner;
public class convert_number_to_word {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        int t1=n;
        int t2=n;
        int b=t1%10,a=t2/10;
        String[] single_digits=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] two_digits=new String[]{"","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen"
                ,"eighteen","nineteen"};
        String[] tens_multiple=new String[]{"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
                if(a==1){
                    System.out.println(two_digits[b+1]);
                }
                else if(b==0){
                    System.out.println(tens_multiple[a]);

                }
                else{
                    System.out.println(tens_multiple[a]+"-"+single_digits[b]);
                }

    }

}
