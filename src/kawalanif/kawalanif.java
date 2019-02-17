/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kawalanif;

/**
 *
 * @author pc 10
 */
import java.util.Scanner;
public class kawalanif {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Berapakah umur anda:");
    int jawapan = input.nextInt();
    
    if (jawapan > 18)
    System.out.println("Anda berada di usia dewasa");
 }
}
