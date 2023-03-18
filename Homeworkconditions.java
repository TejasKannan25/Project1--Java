
// Write a program to take two number inputs and then check which one is larger.
import java.util.Scanner;

class Homeworkconditions {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Type your first number : ");
    int a = input.nextInt();
    System.out.print("Type your 2nd number : ");
    int b = input.nextInt();

    if (a > b) {
      System.out.println(a + " is greater than " + b);
    } else {
      System.out.println(b + " is greater than " + a);
    }

  }
}