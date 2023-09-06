public class TestLine
{
  public static void main (String [] args)
  {
      Line point = new Line(2.32, 3.25, 1, 0 , Color.AUBURN);
      double distance = point.Length();

      System.out.print(point);
      System.out.print(distance);

      System.out.println();

      point = new Line(5.670,0.307, 4.001, 8.058, Color.AZURE);
      distance = point.Length();

      System.out.print(point);
      System.out.print(distance);

      System.out.println();

      point = new Line(9.360,6.226,4.605,4.110, Color.BEIGE);
      distance = point.Length();

      System.out.print(point);
      System.out.print(distance);

      System.out.println();

      point = new Line(0.752,9.955,5.561,9.962,Color.BLOND);
      distance = point.Length();

      System.out.print(point);
      System.out.print(distance);
 
      System.out.println();

  }
}
