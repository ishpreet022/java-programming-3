/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectarea;

public class RectArea{


int length,breadth;
RectArea(int l, int b){
        length = l;
        breadth = b;
}
public int setDim(){
int area = length * breadth;
return area;
}
 public void getArea(){
System.out.println("Area of Rectangle = " +  setDim());
}
public static void main(String []args){
RectArea x =new RectArea(4,5);
x.getArea();
    
}
}