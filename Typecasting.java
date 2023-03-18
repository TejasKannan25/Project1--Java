class Typecasting {
  public static void main(String[]args) { // String args?
    /* this is a 
      multi line comment*/
    int a = 5;
    float b = a;// Widening , implicit type casting.
    System.out.println("The value of B is " + b);
    float x = 5.5f;// Float has more memory as it is 4 bytes INCLUDING DECIMAL                         POINT AND NUMBERS
    int y = (int)x; // Narrowing
    System.out.println("The value of y is " + y);
    
  }
}