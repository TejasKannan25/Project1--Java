// Write a Java program that converts 1000 inches to meters. Hint: One inch is       0.0254 meters.
class Inchtocm {
  public static void main(String[]args){
    int inches = 1000;
    float metres = inches * 0.0254f;
    int m = (int) metres;
    System.out.println("1000 inches to metres is " + metres + " Rounded off , it is " + m);
    
    
  }
}