public class LibraryManager {
  public static void main (String [] args)
  {
    Library Dallas_lib = new Library( "Dallas Library");
    Publication book1 = new Publication("abc", "Joe",2003);


    Dallas_lib.addPublication(book1);

    System.out.print(Dallas_lib);

  }

}

