package module1;

public class ArrayLocation
{
  private int a;
  public double b;
  
  public ArrayLocation(int first, double second)
  {
    this.a = first;
    this.b = second;
  }
  
  public static void incrementBoth(ArrayLocation c1) {
    c1.a = c1.a + 1;
    c1.b = c1.b + 1.0;
  }
  
  // new method
  public static void incrementA(int first)
  {
    first = first + 1;
  }
  
  // new method
  public static void incrementB(double second)
  {
    second = second + 1.0;
  }
  
  public static void main(String[] args)
  {
	  ArrayLocation c1 = new ArrayLocation(10, 20.5);
	  ArrayLocation c2 = new ArrayLocation(10, 31.5);
    // different code below
    incrementA(c2.a);
    incrementB(c2.b);
    System.out.println(c2.a + ", "+ c2.b);
  }
}