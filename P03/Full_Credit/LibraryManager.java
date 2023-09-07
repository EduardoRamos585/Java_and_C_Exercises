import java.util.Scanner;



public class LibraryManager {
  public static void main (String [] args)
  {
    Library Dallas_lib = new Library( "Dallas Library");
    Publication book_one = new Publication("The Adventures of Captain Underpants", "Dav Pilkey",1997);
    Publication book_two = new Publication("Diary of a Wimpy Kid", "Jeff Kinney" , 2007);
    Publication book_three = new Publication("The Book Thief", "Markus Zusak", 2006);



    Dallas_lib.addPublication(book_one);
    Dallas_lib.addPublication(book_two);
    Dallas_lib.addPublication(book_three);



    System.out.print(Dallas_lib);

    Scanner in = new Scanner(System.in);

    System.out.println();
    System.out.print("Which book to check out");
    int selection = in.nextInt();
    System.out.println();
    System.out.print("What is your name ? ");
    String name = in.nextLine();
    System.out.print(" You have selected " + selection + " and your name is " + name);


    

  }

}

