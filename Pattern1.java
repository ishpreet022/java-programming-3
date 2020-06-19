/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern1;

import java.util.Scanner;

public class Pattern1 {
    int num;


    void printPattern(int n) {
        if (n < -num) {

            System.out.print("");
        }
        else {
            System.out.print(" " + Math.abs(n));
            printPattern(n - 1);

        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");

        int n= sc.nextInt();
        Pattern1 s=new Pattern1();
        s.num=n;
        s.printPattern(n);


    }
}
