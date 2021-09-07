import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the principle : ");
    double principle = input.nextDouble();

    System.out.print("Enter the Time : ");
    double time = input.nextDouble();

    System.out.print("Enter the Rate : ");
    double rate = input.nextDouble();

    double simpleInterest = (principle * time * rate) / 100;

    System.out.println("Simple Interest is : " + simpleInterest);

    input.close();
  }
}
