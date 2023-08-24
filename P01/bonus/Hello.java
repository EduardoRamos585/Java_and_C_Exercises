import java.util.Scanner;

public class Hello
{
  public static void main (String [] args)
  {
     String Name;
     System.out.print("Hello, what is your name");
     Scanner in = new Scanner (System.in);
     Name = in.nextLine();
     System.out.print("Hello" + Name + "!");

     in.close();

  }
}
