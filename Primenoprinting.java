import java.util.Scanner;
class Prime{
  public static void main(String[]args){
    Scanner prime = new Scanner(System.in);
    System.out.print("Enter any number to check if it is prime : ");
    int number = prime.nextInt();
    if(number==1){
      System.out.println("1 is neither prime nor composite!"); }
    
    else if(number==2 ){
      System.out.println("The number is prime!");
    }
    int m = number/2;
    int i = 2;
    boolean isPrime = true;
    while(i<=(m+1)){ // i<=m+1 is to accomodate for the number 3.
      
      if(number%i==0){
        System.out.println("The number is not prime!");
        isPrime=false;
        break;
      }
      
      i++;
      
    }
    if (isPrime == true){
      System.out.println("The number is not prime");
    }
    
    
    

    
  }
}
                         
