/*
Title : Develop programs for implementation of implicit and explicit type casting in JAVA.
Assignment : Practical 3
En. No. : 21061207  Date : 31 August 2023
*/
class Practical03{
public static void main(String args[]){
int a = 10;
double b = 15.0;
System.out .println("Implicit Typecasting : ");
b = a;
System.out.println(b);
b = 15.0;
System.out .println("Explicit Typecasting : ");
a = (int) b;
System.out.println(a);
}
}
