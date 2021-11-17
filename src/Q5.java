import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int famwithmanych=0;
        double avr=0;
        int fam=0;
        int peop=1;
        int allp=0;
        while(peop>0){
            System.out.println("Please enter the number of the people in the family");
        peop= input.nextInt();
        allp=allp+peop;
        if(peop>0)
            fam++;
        if(peop>=6)
           famwithmanych++;}
        if(allp<0)
            System.out.println("There are no people");
        else
            avr=(double)allp/fam;
        System.out.println("The average number of people in the family "+avr);
        System.out.println("Families with 6 or more children "+famwithmanych);
    }
}
