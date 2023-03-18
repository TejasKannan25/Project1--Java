// Write a program to check if a number is even or odd.
import java.util.Scanner;
class Evenorodd{
  public static void main(String[]args){
    Scanner number = new Scanner(System.in);
    System.out.print("Type any number : ");
    int a = number.nextInt();

    
    if (a%2==0){
      System.out.println("The number you entered is even!");
    }
    else{
      System.out.println("The number you entered is odd!");
    }
    
  }
  
}