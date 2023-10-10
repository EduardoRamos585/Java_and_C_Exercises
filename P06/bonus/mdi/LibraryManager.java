//Copyright 2023 Eduardo Ramos <https://github.com/EduardoRamos585/cse1325.git
//Copyright 2023 George F. Rice <https://github.com/prof-rice>
//
//
//This file is part of the Library Management System and is licensed 
//under the terms of the GNU General Public License version 3 or any
//later version, see <https://www.gnu.org/licenses/>.





// This is the beginning of Professor Rice's code
package mdi;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.Scanner;
import library.Library;
import library.Patron;
import library.Publication;
import library.Video;

public class LibraryManager{
private Library library;


public LibraryManager (Library library)
{
    this.library = library;
}


public static void main(String[] args) {
	Library library = new Library("Welcome to the Library at Dallas");
        library.addPublication(new Publication("The Cat in the Hat", "Dr. Suess", 1957));
        library.addPublication(new Publication("The Firm", "John Grisham", 1992));
        library.addPublication(new Publication("Foundation", "Isaac Asimov", 1951));
        library.addPublication(new Video("Citizen Kane", "Orson Welles", 1941, 119));
        library.addPublication(new Video("Star Wars", "George Lucas", 1977, 121));
        library.addPublication(new Video("(Seven Samurai)", "Akira Kurosawa", 1954, 207));
        library.addPatron(new Patron("Prof Rice", "george.rice@uta.edu"));
	Scanner in = new Scanner(System.in);
	LibraryManager Manager = new LibraryManager(library);

// This is where I implement new modifications to the code. Please note that we are still using Professor Rice's code
// and all credit goes to him.
	  System.out.println();	
	  System.out.println("Welcome to the Library at Dallas");

 	  System.out.println("=========");
	  System.out.println("Main Menu");
	  System.out.println("=========");
	  System.out.println("\n \n");
          while (true)
	  {

	   System.out.println("How can we help you ?");
	   System.out.println("\n");
	
	   System.out.println("0) Exit");
	   System.out.println("1) List");
	   System.out.println("2) List Patrons");
	   System.out.println("3) Add");
	   System.out.println("4) Check Out");
	   System.out.println("5) Check In");
	   System.out.println("6) Open");
	   System.out.println("7) Save");
	   System.out.print("Selection :");
	   int menuChoice = in.nextInt();
	   System.out.println();
           
	 try
	  {


	     switch(menuChoice){
	     case 0 -> System.exit(0);
	     case 1 -> Manager.ListPublications();
	     case 2 -> Manager.ListPatrons();
	     case 3 -> Manager.Add(in);
	     case 4 -> Manager.Checkout(in);
	     case 5 -> Manager.CheckIn(in);
	     case 6 -> Manager.openLibrary();
	     case 7 -> Manager.saveLibrary();
	     default -> System.out.println("Invalid choice, please try again");

	   
	    }

	 }
	 catch(Exception e)
	 {
           System.err.println(e);
	 }

	




      }






// This is the beginning of my code 

}
    



  public void Add(Scanner in)
  {
  	  System.out.println("Would you like to add a new publication or patron?\n ");
  	  System.out.println(" 0 for new publication, 1 for new patron");
  	  System.out.print("Option :");
	  int addChoice = in.nextInt();

  	  if(addChoice == 0)
  	   {
   		String Pub_Name = System.console().readLine("What is the name of your publication?");
   		String Pub_Author = System.console().readLine("What is the name of the author?");
   		System.out.print("What is the copyright year of your publication ?");
		int year = in.nextInt();
   		System.out.println("If your publication is a video, enter the runtime in minutes. If not, enter 0.");
   		System.out.print("Runtime :");
		int runtime = in.nextInt();
        	if(runtime == 0)
        	{ try{
                   	library.addPublication(new Publication(Pub_Name,Pub_Author,year));
		     }
		     catch(Exception e)
		     {
		       System.err.println(e);
		     }

        	}
        	else
        	{
		  try{

		  
         	      library.addPublication(new Video(Pub_Name,Pub_Author,year,runtime));
		  }
		  catch(Exception e)
		  {
		    System.err.println(e);
		  }


		
	       }

  	  }
  	  else if(addChoice == 1)
   	  {
    		String Pat_Name = System.console().readLine("What is the name of your patron?");
    		String Pat_Email = System.console().readLine("What is the email of your patron?");
		try{

    		   library.addPatron(new Patron(Pat_Name,Pat_Email));
		}
		catch(Exception e)
		{
		  System.err.println(e);
		}

	  }

	  else
	  {
		System.out.println("ERROR: Invalid Command");
	  }

   }



  


   

   public void ListPublications()
   {
     System.out.println(library);
   }


   public void ListPatrons()
   {
     System.out.println(library.patronMenu());
   }


 

   public void Checkout(Scanner in)
   {
     System.out.println();
     System.out.println(library);
     System.out.println();
     System.out.print("Which book to check out ?");
     int selection = in.nextInt();
     System.out.println(library.patronMenu());
     System.out.println();
     System.out.print("Who are you?");
     int patron = in.nextInt();
     library.checkOut(selection, patron);
     System.out.println(library);

	
   }



  public void CheckIn(Scanner in)
  {
    System.out.println();
    System.out.println(library);
    System.out.print("What publication would you like to return ?");
    int index = in.nextInt();
    library.checkIn(index);
  }

  public void openLibrary() throws IOException
  {
    
    String filename = System.console().readLine("What is the name of the file to load ?");
    try(BufferedReader br = new BufferedReader(new FileReader(filename)))
    {
      library = new Library(br);

    }
    catch(Exception e)
    {
     System.err.println(e);
    }



  

  }


  public void saveLibrary() throws IOException
  {
     String filename = System.console().readLine("What is the name of your save file ?");
     try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename)))
     {
      library.save(bw);
     }catch (Exception e) {
       System.err.println("Failed to write: " + e);

     }

  }

}
