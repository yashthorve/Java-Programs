/*
Title : Write a java program to implement different types of constructors to perform addition of complex numbers.
Assignment : Develop programs for implementation
a) Constructer
b) multiple Constructers
En. No. : 2106207 Date : 31 August 2023
*/
class Practical04{
double number1,number2;
Practical4(){
number1 = 10.00;
number2 = 25.00;
}
Practical4(double n1, double n2){
number1 = n1;
number2 = n2;
}
double sum(){
return number1 + number2;
}
public static void main(String[] args){
Practical4 object1 = new Practical4();
Practical4 object2 = new Practical4(15.00,98.00);
System.out.println("Sum for Object 1 is :" + object1.sum());
System.out.println("Sum for Object 2 is :" + object2.sum());
}
}