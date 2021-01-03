import java.util.Scanner;
public class exam1 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an amount in double, for example 11.56: ");
//        double amount = input.nextDouble();
        String data[] = new String[13];
        data[1]="January";
        data[2]="February";
        data[3]="March";
        data[4]="April";
        data[5]="May";
        data[6]="June";
        data[7]="July";
        data[8]="August";
        data[9]="September";
        data[10]="October";
        data[11]="November";
        data[12]="December";

        int number = (int)(Math.random()*12)+1;

        System.out.println(data[number]);

    }
}
