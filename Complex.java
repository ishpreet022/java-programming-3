/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;


import java.util.*;
 
public class Complex 
{		
	public static void main(String args[])
	{
		int ch=0;
		float num1,num2,answer;		
		Complex_Op cal = new Complex_Op() ;
		Scanner input =  new Scanner(System.in);
 
		System.out.print("Enter the first Number\n");
		System.out.print("Real Part:");
		num1 = input.nextInt();
		System.out.print("Imaginary Part:");
		num2 = input.nextInt();
		Complex_Op Object1  = new Complex_Op(num1,num2);
 
		System.out.print("Enter the Second Number\n");
		System.out.print("Real Part:");
		num1 = input.nextInt();
		System.out.print("Imaginary Part:");
		num2 = input.nextInt();
		Complex_Op Object2  = new Complex_Op(num1,num2);
		do
		{
			System.out.println("1.Add");
			System.out.println("2.Subtract");			
			System.out.println("3.Multiplication");			
			System.out.println("4.Exit");
			System.out.print("Choose any option:");
			ch = input.nextInt();
			switch(ch)
			{
				case 1:				
					cal.AddNumbers(Object1,Object2);
					break;				
				case 2:
					cal.SubtractNumbers(Object1,Object2);
					break;
				case 3:				
					cal.MultiplyNumbers(Object1,Object2);
					break;				
				case 4:				
					break;			
							
									
			}
		}while(ch!=4);			
	}
}
 
class Complex_Op 
{
	private float real,imag;	
	Complex_Op()
	{
		real=0;
		imag=0;
	}
	Complex_Op(float Comp1,float Comp2)
	{
		real=Comp1;
		imag=Comp2;
	}	
	void  AddNumbers(Complex_Op C1,Complex_Op C2)
	{
		float real,imag;
		this.real = (C1.real + C2.real); 
		this.imag = (C1.imag + C2.imag);
		System.out.println("Answer is:("+this.real+") + ("+this.imag+")i" );		
	}
	void SubtractNumbers(Complex_Op C1,Complex_Op C2)
	{
		float real,imag;
		this.real = (C1.real - C2.real); 
		this.imag = (C1.imag - C2.imag);
		System.out.println("Answer is:("+this.real+") + ("+this.imag+")i" );		
	}
	void MultiplyNumbers(Complex_Op C1,Complex_Op C2)
	{
		float real,imag;
		this.real = (C1.real*C2.real - C1.imag*C2.imag); 
		this.imag = (C1.real*C2.imag + C2.real*C1.imag);
		System.out.println("Answer is:("+this.real+") + ("+this.imag+")i" );	
	}
	
}
