/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author ABOBA
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("vvedite temp v cels: ");
        int C = scanner.nextInt();
        final double Fr = (double)C*9/5+32;
        System.out.printf("Temp in F: "+Fr+"\n");
        
        System.out.print("Vvedite 3x znachnoe chislo: ");
        int num = scanner.nextInt();
        int a= ((int)num/100);
        int b = ((int)num/10%10);
        int c = (int)num-((int)num/10)*10;
        System.out.printf(String.join("%n",
                "sotni:%1$-5d\n",
                "des9tki:%2$-5d\n",
                "edenici:%3$-5d"), a, b, c);
    }
    
}
