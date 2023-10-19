/*
Title : a) Develop a program to accept input using command line argument.
b)Develop programs for implementation of Arrays in JAVA
Assignment : Practical 5
En. No. : 2106207 Date : 31 August 2023
*/
class Practical05{
public static void main(String args[]){
System.out.println("My name is " + args[0]);
int[][] twoDArray = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
for (int[] row : twoDArray) {
for (int element : row) {
System.out.print(element + " ");
}
System.out.println();
}
}
}
