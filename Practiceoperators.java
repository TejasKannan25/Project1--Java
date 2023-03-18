import java.util.Scanner;
class Practice{
  public static void main(String[]args) {
    Scanner relation = new Scanner (System.in);
    System.out.print("Type one of the secret code to enter into System :  ");
    String a = relation.next();
    String b =  ("Jamesatecake");
    String c =  ("Johneatsapples");// new string creates a new memory space for both Strings
    if (a.equals(b)||a.equals(c)){ // .equals uses char by char.
      System.out.println("System access accepted , enjoy! ");
    }
    else{
      System.out.println("System access denied , try again! If you are an intruder , leave immedietly! ");
    }
      
  }
}