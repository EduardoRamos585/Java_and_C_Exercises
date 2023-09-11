import java.util.Scanner;
import java.io.*;



public class LibraryManager {
  public static void main (String [] args) throws Exception
  {
    Library Dallas_lib = new Library( "Dallas Library");
    File file = new File("C:\\Users\\Eduar\\cse1325\\P03\\Extreme_Bonus\\Publications_List.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));
    File file2 = new File("C:\\Users\\Eduar\\cse1325\\P03\\Extreme_Bonus\\Patrons_List.txt");
    BufferedReader br2 = new BufferedReader(new FileReader(file2));


    String st;
    String st2;

   try
   {

    while((st = br.readLine())!= null)
    {
	
    	String[] parts = st.split(",");
	int num = Integer.parseInt(parts[2]);
	Publication book = new Publication(parts[0],parts[1],num);

	Dallas_lib.addPublication(book);

    }

    while((st2 = br2.readLine())!= null)
    {
       String[] parts2 = st2.split(",");
       Patron client = new Patron(parts2[0],parts2[1]);

       Dallas_lib.addPatron(client);
    }


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

