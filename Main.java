import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("hello");
    System.out.println("H"); // out - output , print - print in same line , println - Print in new line.
    System.out.println("H\ne\nl\nl\n\to");
    // \t - Tab space, \n- new line , \b - backspace

    Scanner scan = new Scanner(System.in);
    // scan is the name of the variable
    System.out.print("Enter a number: ");
    int a = scan.nextInt();
    System.out.print("Enter second number: ");
    // Dont use println as number will be below Enter number statement.
    int b = scan.nextInt();

    System.out.println("The number is " + a);
    System.out.println("The number is " + b);
  }
}