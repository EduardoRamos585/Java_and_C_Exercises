//Copyright 2023 Eduardo Ramos <https://github.com/EduardoRamos585/cse1325.git
//Copyright 2023 George F. Rice <https://github.com/prof-rice>
//
//
//This file is part of the Library Management System and is licensed 
//under the terms of the GNU General Public License version 3 or any
//later version, see <https://www.gnu.org/licenses/>.





// This is the beginning of Professor Rice's code
package mdi;

import library.Library;
import library.Patron;
import library.Publication;
import library.Video;

public class LibraryManager{
	public static void main(String[] args) {
        Library library = new Library("The Library at Alexandria (Texas)");
        library.addPublication(new Publication("The Cat in the Hat", "Dr. Suess", 1957));
        library.addPublication(new Publication("The Firm", "John Grisham", 1992));
        library.addPublication(new Publication("Foundation", "Isaac Asimov", 1951));
        library.addPublication(new Video("Citizen Kane", "Orson Welles", 1941, 119));
        library.addPublication(new Video("Star Wars", "George Lucas", 1977, 121));
        library.addPublication(new Video("(Seven Samurai)", "Akira Kurosawa", 1954, 207));
        library.addPatron(new Patron("Prof Rice", "george.rice@uta.edu"));
// This is where I implement new modifications to the code. Please note that we are still using Professor Rice's code
// and all credit goes to him.

	System.out.println("=========");
	System.out.println("Main Menu");
	System.out.println("=========");
	System.out.println("\n \n");

	System.out.println("The Library at Alexandria (Texas)");
	System.out.println("\n \n");
	
	System.out.println("0) Exit");
	System.out.println("1) List");
	System.out.println("2) Add");
	System.out.println("3) Check Out");
	System.out.println("4) Check In");
	
	int menuChoice = Integer.parseInt(System.console().readLine("Selection :"));

	switch(menuChoice){
	case 0 -> System.exit(0);
	case 1 -> System.out.println(library);
	case 2 -> Add(library);
	default -> System.out.println("Invalid choice");
	}

//        System.out.println(library);

//        int selection = Integer.parseInt(System.console().readLine("\nWhich book to check out? "));
//        System.out.println(library.patronMenu());
//        int patron = Integer.parseInt(System.console().readLine("\nWho are you? "));
//        library.checkOut(selection, patron);
//        System.out.println(library);



// This is the beginning of my code 


    }



  public static void Add(Library library)
  {
  	  System.out.println("Would you like to add a new publication or patron\n ");
  	  System.out.println(" 0 for new publication, 1 for new patron");
  	  int addChoice = Integer.parseInt(System.console().readLine("Option :"));

  	  if(addChoice == 0)
  	   {
   		String Pub_Name = System.console().readLine("What is the name of your publication?");
   		String Pub_Author = System.console().readLine("What is the name of the author?");
   		int year =  Integer.parseInt(System.console().readLine("What is the copyright year?"));
   		System.out.println("\n If your publication is a video, enter the runtime in minutes. If not, enter 0");
   		int runtime = Integer.parseInt(System.console().readLine("Runtime :"));
        	if(runtime == 0)
        	{
                   library.addPublication(new Publication(Pub_Name,Pub_Author,year));

        	}
        	else
        	{
         	   library.addPublication(new Video(Pub_Name,Pub_Author,year,runtime));
        	}	
  	  }
  	  else
   	  {
    		String Pat_Name = System.console().readLine("What is the name of your patron?");
    		String Pat_Email = System.console().readLine("What is the email of your patron?");
    		library.addPatron(new Patron(Pat_Name,Pat_Email));
   	  }	
   }
}

