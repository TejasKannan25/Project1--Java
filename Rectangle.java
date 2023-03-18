import java.util.Scanner;

class Rectangle {
  public static void main(String[] args) {
    Scanner rectangle = new Scanner(System.in);
    System.out.print("Enter the length of Rectangle: ");
    int len = rectangle.nextInt();
    System.out.print("Enter the breadth of Rectangle: ");
    int bred = rectangle.nextInt();
    int area = len * bred;
    int perimeter = 2 * (len + bred);
    System.out.println("The area of the rectangle is : " + area + " m^2");
    System.out.println("The perimeter of the rectangle is : " + perimeter + " m");

  }
}