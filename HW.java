// take 2 nos range (a,b) and print all odd and even nos in between
// to check if a number 
import java.util.Scanner;
class HW{
  public static void main(String[]args){
          Scanner integer = new Scanner(System.in);
    System.out.print("Enter 1st number : ");
          int start = integer.nextInt();
    System.out.print("Enter 2nd number : ");
          int end = integer.nextInt();

    int i= start;
    if(start>end){
      System.out.println("Invalid input : First no. has to be smaller than second");
    }
    while(i<=end ){
      if(i%2==1){ // for even write i%2==0
        System.out.println(i);
    
      }
      i++;
    }
    

          
          
          }
      }
    
  
