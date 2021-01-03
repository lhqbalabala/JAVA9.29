import com.sun.beans.editors.DoubleEditor;

import java.util.Scanner;

public class exam9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x=input.nextDouble();
        double y=input.nextDouble();
        if(x<0||y<0||y>-x/2.0+100)System.out.println("The point is not in the triangle");
        else System.out.println("The point is in the triangle");
    }
}