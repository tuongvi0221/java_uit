/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai01;
public class main {
    public static void main(String [] args){
    Pointer p1 = new Pointer();
    Pointer p2 = new Pointer();
    
    System.out.println("Enter the Information of Pointer_1");
    p1.input();
    System.out.println("Enter the Information of Pointer_2");
    p2.input();
    
    System.out.println("The Information of Pointer_1");
    p1.output();
    System.out.println("The Information of Pointer_2");
    p2.output();
    
    System.out.println("The distance between Pointer_1 and Pointer_2");
     System.out.println(p1.distance(p2));
    }
}
