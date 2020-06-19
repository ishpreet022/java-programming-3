/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern2;

import java.util.Scanner;

public class Pattern2 {

    int no, num;

    void printpattern(int n,int k) {
        if (Math.abs(n) <= num) {
            if (n > 0) {
                System.out.print(" " + n);
                printpattern(n - k, k);
            }
            if (n <= 0) {
                no = n;
                System.out.print(" " + no);
                no = Math.abs(no);
                while (Math.abs(no) < num) {
                    no=no-k;
                    System.out.print(" " + Math.abs(no));
                }
            }

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
       System.out.println("enter k");
       int k= sc.nextInt();
        Pattern2 s=new Pattern2();
        s.num=n;
        s.printpattern(n,k);

    }
}
