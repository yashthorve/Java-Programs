/*
Title : Program on If - Else, For, While, and Do-While.
Assignment : Develop programs to demonstrate the use of different control statements and
‘for’, ‘while’, and ‘do-while’ looping Statements.
En. No. : 2106207  Date : 17 August 2023
*/
class Practical02 {
public static void main(String args[]) {
// If
int i = 5;
if (i < 10) {
System.out.println("Inside If");
}
// If - Else
int age = 19;
if (age >= 18) {
System.out.println("You are eligible for a License !!");
} else {
System.out.println("You are not yet eligible for a License !!");
}
// If - ElseIf
int num = 5;
if (num > 0) {
System.out.println("The number is positive.");
} else if (num < 0) {
System.out.println("The number is negative.");
} else {
System.out.println("The number is zero.");
}
// For loop
System.out.println("Printing all even numbers between 0 to 100:");
for (i = 2; i <= 100; i += 2) {
System.out.print(i + " ");
}
// While loop
System.out.println("\nPrinting the table of 2:");
int n = 2;
int j = 1;
while (j <= 10) {
System.out.print(n * j + " ");
j++;
}
// Do - While
System.out.println("\nPrinting odd numbers from 0 to 100 : ");
int k = 3;
do {
System.out.print(k + " ");
k += 2;
} while (k <= 100);
}
}
