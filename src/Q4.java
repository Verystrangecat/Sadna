import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Please enter the amount of hours the student has spent doing homework");
        Scanner input=new Scanner(System.in);
        int st=0;
        int h= input.nextInt();
        while(h<=70 ){
            System.out.println("Please enter the amount of hours the student has spent doing homework");
            h= input.nextInt();
            if(h>=15)
                st++;}
        System.out.println(st+" students did homework more than 15 hours a week");

        }

    }

