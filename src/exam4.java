import java.util.Scanner;

public class exam4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 3 sides: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a+b>c&&b+c>a&&c+a>b)System.out.println("Perimeter is:"+(a+b+c));
        else System.out.println("Illegal input");



    }
}