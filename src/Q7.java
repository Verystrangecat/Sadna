import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Q7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the amount of apples (kg) a student collected");
      double  kg= input.nextDouble();
       double best=kg;
       double best2=0;
        while ( kg>0 ){
            System.out.println("Please enter the amount of apples (kg) a student collected");
            kg= input.nextDouble();
            if (kg>best){
                best2=best;
                best=kg;
            }
        }
        System.out.println("The first place "+best+" kg");
        System.out.println("The second place "+best2+" kg");
        }


    }

