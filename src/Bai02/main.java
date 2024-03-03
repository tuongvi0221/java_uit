/*
  */
package Bai02;

import java.util.Scanner;

public class main {
    public static void main (String[] agrs){
        Rectangle r1 = new Rectangle();
        Scanner iput = new Scanner(System.in);
        System.out.println("Enter the Length ");
        r1.set_Length(iput.nextInt());
        System.out.println("Enter the Width ");
        r1.set_Width(iput.nextInt());
        
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        
        System.out.println(r1.toString());
 
    }
}
