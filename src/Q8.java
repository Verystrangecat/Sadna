import java.util.Scanner;


public class Q8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int a= input.nextInt();
        int b= input.nextInt();
        int d=0;
        int repeats=1;
        int result;
        if (a>b)
            result=a-b;
        else result=b-a;
        System.out.println("The result is: "+result);
        while(a>=0 && b>=0 && repeats<20 && result!=1){
            System.out.println("Please enter two numbers:");
             a= input.nextInt();
             b= input.nextInt();
             if (a>b)
                result=a-b;
            else result=b-a;
            repeats++;
            System.out.println("The result is: "+result);}
        System.out.println("The number of repeats: "+repeats);

        }

    }

