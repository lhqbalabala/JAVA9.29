
import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String integer = input.next();
        int sum=0;
        int cot=9;
        for(int i=0;i<9;i++) {
            sum += (integer.charAt(i) - '0') * (i + 1);

        }
        int digit10=sum%11;

        System.out.print(integer);
        if(digit10==10){System.out.print("X");}
        else
        {
            System.out.print(digit10);}

    }
}