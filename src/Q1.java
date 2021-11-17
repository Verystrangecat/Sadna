import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("I love you");
        Scanner input=new Scanner(System.in);
        System.out.println("If you want to continue print 'true', if you don't print 'false' ");
        boolean a=input.nextBoolean();
        while (a) {
            System.out.println("I love you");
            a = input.nextBoolean();
        }
        System.out.println("Finish");
    }
}
