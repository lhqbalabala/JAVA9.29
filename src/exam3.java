import java.util.Scanner;

public class exam3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 3 numbers: ");
        int flag1=0,flag2=0,flag3=0,sum1=0,sum2=0;
        int[] myList = new int[3];
        for (int i=0;i<2;i++){
            myList[i] = (int)(Math.random()*999)+1;
        }
        for(int i=0;i<2;i++){

            int numbers=input.nextInt();
            if(numbers==myList[i])sum1++;
            for(int j=0;j<2;j++){
                if(numbers==myList[j]){
                    sum2++;
                    break;
                }
            }
        }
        System.out.print("you win: ");
        if(sum1==3)System.out.println("10000");
        else if(sum2==3)System.out.println("3000");
        else if(sum2==2)System.out.println("2000");
        else if(sum2==1)System.out.println("1000");
        else System.out.println("0");


    }
}