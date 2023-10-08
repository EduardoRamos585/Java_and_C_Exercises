// Copyright 2023 Eduardo Ramos <https://github.com/EduardoRamos585/cse1325.git>
// Copyright 2023 George F. Rice <https://github.com/prof-rice>
//
// This file is part of the Library Management System and is licensed
// under the terms of the Gnu General Public License version 3 or
// any later version, see <https://www.gnu.org/licenses/>.




package library;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


/**
 * Models a library containing various publications.
 *
 * @author             Professor George F. Rice
 * @version            1.0
 * @since              1.0
 * @license.agreement  Gnu General Public License 3.0
 */
public class Library {
    /**
     * Creates a Library instance.
     *
     * @param name         the name of the library
     * @since              1.0
     */
    public Library(String name) {
        this.name = name;
        this.publications = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }
    /**
     * Adds a publication to this library instance.
     *
     * @param publication  the publication to add to the library
     * @since              1.0
     */
    public Library(BufferedReader br) throws IOException
    {
      this.name = br.readLine();
      this.publications = new ArrayList<>();
      this.patrons = new ArrayList<>();
      int size = Integer.parseInt(br.readLine());
      String parameter;
      for(int i = 0 ; i < size ; i++)
      {
	 parameter = br.readLine();

	 if(parameter.equals("publication"))
	 {
           Publication o = new Publication(br);
	   publications.add(o);
	 }

	 if(parameter.equals("video"))
	 {
	   Video i = new Video(br);
	   publications.add(i);

	 }


      }

      int patronSize = Integer.parseInt(br.readLine());
      for(int i = 0; i < patronSize ; i++)
      {
         Patron j = new Patron(br);
	 patrons.add(j);

      }


    }


    public void addPublication(Publication publication) {
        publications.add(publication);
    }
    /**
     * Adds a patron to this library instance.
     *
     * @param patron  the patron to add to the library
     * @since              1.0
     */
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }
    /**
     * Lists all patrons in this library instance.
     *
     * The index shown in the resulting String may be used 
     * to select a patron using the checkOut() method.
     *
     * @returns     the string representation of all library patrons
     * @since       1.0
     */
    public String patronMenu() {
       StringBuilder sb = new StringBuilder("Patrons\n\n");
        for(int i=0; i<patrons.size(); ++i)
            sb.append("" + i + ") " + patrons.get(i).toString() + "\n");
        return sb.toString();
    }
    /**
     * Checks out a publication from this library instance.
     *
     * The due date will be set to 2 weeks from the current date.
     *
     * @param publicationIndex  the index as shown by toString()
     * @param patronIndex       the index as shown by patronMenu()
     * @since                   1.0
     */
    public void checkOut(int publicationIndex, int patronIndex) {
        try {
            publications.get(publicationIndex).checkOut(patrons.get(patronIndex));
        } catch(Exception e) {
            System.err.println("\nUnable to check out publication #" + publicationIndex 
                + ": " + e.getMessage() + "\n");
        }
    }


   /**
    * Returns the publication to the library 
    *
    *
    *@param publicationIndex   the index of the publication to be returned.
    *
    *@since                    1.0 
    *
    */

    public void checkIn(int publicationIndex)
    {
      try{
	   publications.get(publicationIndex).checkIn();
      } catch(Exception e){

	  System.err.println("\nNon-existent publication at " + publicationIndex + ":" + e.getMessage() + "\n");
      }


    }
// checkIn was written by me. All other codes was written by Profeesor Rice.



    public void save(BufferedWriter bw) throws IOException
    {
       bw.write( name + '\n');
       bw.write("" + publications.size() + '\n');
       for(Publication i : publications)
       {
         if(i instanceof Publication && !(i instanceof Video))
	  {
	    bw.write("publication " + '\n');
	    
	 
	  }

	  if(i instanceof Video)
	  {
            bw.write("video" + '\n');
            
	    

	  }

	  i.save(bw);

      }

      bw.write("" + patrons.size() + '\n');
      for(Patron o : patrons)
      {
         o.save(bw);
      }


   }


     

   



    /**
     * Lists all publications in this library instance.
     *
     * The index shown in the resulting String may be used 
     * to check out a publication using the checkOut() method.
     *
     * @returns     the string representation of all library publications
     * @since       1.0
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + "\n\n");
        for(int i=0; i<publications.size(); ++i)
            sb.append("" + i + ") " + publications.get(i).toString() + "\n");
        return sb.toString();
    }
    private String name;
    private ArrayList<Publication> publications;
    private ArrayList<Patron> patrons;
}
