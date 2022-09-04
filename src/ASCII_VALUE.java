import java.util.Scanner;
public class ASCII_VALUE {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter character which want ascii value:");
        char chr=s.next().charAt(0);
        int asciiValue =chr;
        System.out.printf("ASCII value of %c is %d",chr,asciiValue);
    }
}
