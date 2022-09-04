//how to generate a random number in java



//public class random_number {
//    public static void main(String[] args) {
//        System.out.println("1st random num "+Math.random());
//        System.out.println("2st random num "+Math.random());
//        System.out.println("3st random num "+Math.random());
//        System.out.println("4st random num "+Math.random());
//
//
//    }
//}


public class random_number {
    public static void main(String[] args) {
        int min=100;
        int max=500;
        System.out.println("random number of type double between "+min+" to "+max+":");
        double a=Math.random()*(max-min+1)+min;
        System.out.println(a);


        System.out.println("random number of type int between "+min+" to "+max+":");
        int b=(int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}


