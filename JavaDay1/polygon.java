import java.util.*;
public class polygon {
    int n ;
    int [] sides;

    public void polygon(int no_sides)
    {
       this.n = no_sides;
       this.sides = new int[no_sides];
    }
    void inputsides()
    {
        Scanner s = new Scanner(System.in);
        for(int i =0;i<this.n;i++)
        {
            System.out.println("Enter the sides : ");
            this.sides[i]= s.nextInt();
        }
    }
    void display()
    {
        for(int i =0;i<this.n;i++)
        {
            System.out.println(this.sides[i]);
        }
    }
}

class triangle extends polygon{
  public triangle()
  {
      super.polygon(3); // we are calling the constructor of the superclass.
  }
  void area()
  {
      int a = super.sides[0];
      int b = super.sides[1];
      int c = super.sides[2];

      int s = (a+b+c)/2;
      int area = (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("The area is "+area);
  }
}