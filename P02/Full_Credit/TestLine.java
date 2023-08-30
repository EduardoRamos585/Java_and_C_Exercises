public class TestLine
{
  public static void main (String [] args)
  {
      Line point = new Line(2.32, 3.25, 1, 0 , Color.BLOND);
      double distance = point.Length();

      System.out.print(point);
      System.out.print(distance);
  }
}
