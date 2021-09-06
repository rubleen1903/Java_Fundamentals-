import java.util.Scanner; //should be on top always


public class siuser {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int s= a+b;

    System.out.println(s);
    sc.close();
    }
}
