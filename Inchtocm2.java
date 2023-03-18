import java.util.Scanner;
class Inchtocm2{
  public static void main(String[]args){
    Scanner inches = new Scanner(System.in);
    System.out.print("Type how many inches are to be converted to metres : "); // Only print for same line and print ln for next line input!
    int inch = inches.nextInt(); // Only nextLine() for string ( Line )


    float metres = inch * 0.0254f;
    System.out.println(inch + " inches is equal to " + metres + " metres !");
    
    // How to make it such that the user types the input in same line.
    // How to make sure that input is a string instead of integer.
      
  }
}

/// Acccess Modeifier 
// public --> in case of public class , Class name and program name has to be the same
// private , default

// Java Program --> javac is the compiler of Java.
// Interpreter interprets class files
// when javac filename.java is types new file will form for each class.

// logical and - &&
// logical or = ||
// logical not = !
// == sign is boolean 
/// eg : 5==7 ; is false.
// 5=7 is assignment but 5==7 is boolean. 
// Relational operato = < > <= >= == = 

// bitwise operator
// and (&) , or , xor , not.






