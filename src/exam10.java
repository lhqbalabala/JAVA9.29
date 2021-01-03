
import com.sun.beans.editors.DoubleEditor;

import java.util.Scanner;

public class exam10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width , and height: ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double width1=input.nextDouble();
        double height1=input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width , and height: ");
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double width2=input.nextDouble();
        double height2=input.nextDouble();
        if(y2+height2/2.0<=y1+height1/2.0&&y2-height2/2.0>=y1-height1/2.0&&x2+width2/2.0<=x1+width1/2.0&&x2-width2/2.0>=x1-width1/2.0)
            System.out.println("r2 is inside r1");
        else if(y2+height2/2.0<y1-height1/2.0||y2-height2/2.0>y1+height1/2.0||x2+width2/2.0<x1-width1/2.0||x2-width2/2.0>x1+width1/2.0)
            System.out.println("r2 does not overlap rl");
        else
            System.out.println("r2 overlaps r1");
    }
}