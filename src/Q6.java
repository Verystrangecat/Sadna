import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double biggest=0;
        double smallest=0;
        double p=0;
        while (p>=0){
            System.out.println("Please enter the price of humus in a restaurant:");
            p= input.nextDouble();
            if (p>biggest && p>=0)
                biggest=p;
            else if(p<smallest && p>=0)
                smallest=p;}
        System.out.println("The biggest price is "+biggest);
        System.out.println("The smallest price is "+smallest);

    }
}
