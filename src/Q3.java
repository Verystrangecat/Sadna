import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum, flat;
        double am = 0;
        System.out.println("enter number of flats");
        flat = input.nextInt();
        sum = 0;
        while (flat >= 0) {
            sum = sum + flat;
            System.out.println("enter number of flats or negative number to finish");
            flat = input.nextInt();
            am++;
            }

        System.out.println(sum+" flats are sold");
        System.out.println("The average is "+(sum/am));
    }
}