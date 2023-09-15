package mdi;
import library.*;
import java.util.Scanner;



public class LibraryManager {
  public static void main (String [] args)
  {
    Library Dallas_lib = new Library( "Dallas Library");
    Publication book_one = new Publication("The Adventures of Captain Underpants", "Dav Pilkey",1997);
    Publication book_two = new Publication("Diary of a Wimpy Kid", "Jeff Kinney" , 2007);
    Publication book_three = new Publication("The Book Thief", "Markus Zusak", 2006);
    Video Video_1 = new Video("Star Wars","George Lucas", 2002,154);
    Patron client_1 = new Patron("Eduardo Ramos", "exr4020@mavs.uta.edu");

   try
   {

    Dallas_lib.addPublication(book_one);
    Dallas_lib.addPublication(book_two);
    Dallas_lib.addPublication(book_three);
    Dallas_lib.addPublication(Video_1);
    Dallas_lib.addPatron(client_1);
   }
   catch(Exception e)
   {
     System.err.println(e.getMessage());
     System.exit(-1);
   }



    System.out.print(Dallas_lib);

    Scanner in = new Scanner(System.in);

    System.out.println();
    


    try
    {
     System.out.print("Which book would you like to check out");
     int selection = in.nextInt();
     System.out.println();
     Dallas_lib.patronMenu();
     System.out.println();
     System.out.print("Who are you");
     int index_Patron = in.nextInt();
     Dallas_lib.checkOut(selection,index_Patron);
     
    }
    catch(Exception e)
    {
      System.out.println();
      System.err.println(e.getMessage());
      System.out.println();
    }


    System.out.println();
    System.out.print(Dallas_lib);





    

  }

}

