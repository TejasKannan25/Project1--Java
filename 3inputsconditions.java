// Take 3 input numbers and print which one is the largest,smallest and the middle number
import java.util.Scanner;

class Homeworkconditions {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Type your first number : ");
    int a = input.nextInt();
    System.out.print("Type your 2nd number : ");
    int b = input.nextInt();
    System.out.print("Type the 3rd number : ");
    int c = input.nextInt();

    if (a > b && a > c) { 
      System.out.println(a + " is the largest ");
      if (b>c){
        System.out.println(c + " is the smallest ");
        System.out.println(b + "is the middle no.");
          
      }
      else{
        System.out.println(b + " is the smallest no.");
        System.out.println(c + " is the middle number");
      }
    }
    else if (b>c){
      System.out.println(b + " is the largest");  
      if (a>c){
        System.out.println(c + " is the smallest ");
        System.out.println(a + "is the middle no.");
          
      }
      else{
        System.out.println(a + " is the smallest no.");
        System.out.println(c + " is the middle number");
      }
    }
    else{
      System.out.println(c + " is the largest");
      if (b>a){
        System.out.println(a + " is the smallest ");
        System.out.println(b + "is the middle no.");
          
      }
      else{
        System.out.println(b + " is the smallest no.");
        System.out.println(a + " is the middle number");
      }
    }
  }
}