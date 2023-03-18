import java.util.Scanner;
class Multiplicationtable{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number to find myltiplication table : ");
    int no = input.nextInt();

    for(int i = 1; i<=10 ; i++){
      
      System.out.println(no + "X" + i + " = " + (no*i));
    }
  }
}