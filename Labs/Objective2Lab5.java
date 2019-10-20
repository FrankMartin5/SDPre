public class Objective2Lab5 {
  public static void main(String[] args) {
    double side1, side2, side1Squared, side2Squared, hypotenuse;
    side1 = 8;
    side2 = 10.0;
    side1Squared = side1*side1;
    side2Squared = side2*side2;
    hypotenuse = Math.sqrt(side1Squared+side2Squared);
    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
  }
}
