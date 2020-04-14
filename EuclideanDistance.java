// Java program to find Euclidean Distance.

import java.util.Scanner; 
public class EuclideanDistance{
public static void main(String args[]){
System.out.println ("Enter any 4 numbers for x1,x2,y1 and y2 respectively. ");
Scanner s = new Scanner (System.in);
double x1 = s.nextInt();
double x2 = s.nextInt();
double y1 = s.nextInt();
double y2 = s.nextInt();
double d = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2)); 
System.out.println(d);
}
}
 