/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrongnum;

import java.util.Scanner;
public class ArmstrongNum{
    public static void main(String args[]) {
    System.out.println("Please enter a three digit number:"); 
    int num = new Scanner(System.in).nextInt();
    if(isArmstrong(num)){ System.out.println("Number : " + num + " is an Armstrong number"); }
    else{ System.out.println("Number : " +num + " is not an Armstrong number");
    }
    }
     private static boolean isArmstrong(int num){
     int result = 0;
     int org = num; 
     while(num != 0){
         int remainder = num%10;
     
     result = result + remainder*remainder*remainder;
      num = num/10; }
     if(org == result){
         return true;
     }
     return false;

     }

     
     

}