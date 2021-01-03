import java.util.Scanner;

public class exam8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] List1 = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] List2={"Clubs","Diamonds","Hearts","Spades"};
        int select1=(int)(Math.random()*12)+1;
        int select2=(int)(Math.random()*4)+1;
        System.out.println("The card you picked is "+List1[select1]+" of "+List2[select2]);
    }
}