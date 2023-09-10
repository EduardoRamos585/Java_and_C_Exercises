import java.util.Scanner;



public class LibraryManager {
  public static void main (String [] args)
  {
    Library Dallas_lib = new Library( "Dallas Library");
    Publication book_one = new Publication("The Adventures of Captain Underpants", "Dav Pilkey",1997);
    Publication book_two = new Publication("Diary of a Wimpy Kid", "Jeff Kinney" , 2007);
    Publication book_three = new Publication("The Book Thief", "Markus Zusak", 2006);


   try
   {

    Dallas_lib.addPublication(book_one);
    Dallas_lib.addPublication(book_two);
    Dallas_lib.addPublication(book_three);
   }
   catch(Exception e)
   {
     System.err.println(e.getMessage());
     System.exit(-1);
   }



    System.out.print(Dallas_lib);

    Scanner in = new Scanner(System.in);

    System.out.println();
    System.out.print("What is your name ?");
    String name = in.nextLine();
    System.out.print("What book would you like ? ");


    try
    {
     int selection = in.nextInt();
     Dallas_lib.checkOut(selection,name);
     
    }
    catch(Exception e)
    {
      System.out.println();
      System.err.println(e.getMessage());
      System.out.println();
    }



    System.out.print(Dallas_lib);





    

  }

}

