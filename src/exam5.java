import java.util.Scanner;

public class exam5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year:(e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int q =day;
        int m = month;
        int j = year / 100;
        if (j < 0) j = -j;
        int k = year % 100;
        int h = (q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
        System.out.print("Day of the week is ");
        if(h==0)System.out.println("Saturday");
        if(h==1)System.out.println("Sunday");
        if(h==2)System.out.println("Monday");
        if(h==3)System.out.println("Tuesday");
        if(h==4)System.out.println("Wednesday");
        if(h==5)System.out.println("Thursday");
        if(h==6)System.out.println("Friday");
    }
}