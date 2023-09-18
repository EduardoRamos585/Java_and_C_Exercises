package library;

import java.util.ArrayList;

/**
 * Models a library containing various publications
 *
 * @author  Eduardo Ramos
 *
 * @version 1.0
 *
 * @since 1.0
 *
 * @license.agreement Gnu General Public License 3.0
 *
 * 
*/


public class Library
{
  private String name;
  private ArrayList <Publication> publications;
  private ArrayList <Patron> patrons;

  public Library (String name)
  {
    this.name = name;

    this.publications = new ArrayList <Publication>();

    this.patrons = new ArrayList <Patron>();
 
  }
  




/**
 * Adds a publication to the class Publication ArrayList
 *
 * @param publication    the publication being added to the library
 *
 *
*/

  public void addPublication ( Publication publication)
  { 
    
   publications.add(publication);


  }


 /**
  *
  * Adds a patron to the class Patron ArrayList
  *
  * @param patron    the patron being added to the patron list
  *
  *
 */
  public void addPatron(Patron patron)
  {
    patrons.add(patron);
  }




/**
 * Prints out the patron list for user to choose 
 *
 *
 *
*/
  public String patronMenu()
  {
    int p = 0; 
    System.out.println(" Patrons");
    System.out.println();

    for(Patron i : patrons)
    {
      System.out.println("("+p + i );
      p++;
    }

    return "\n";



  }



  /**
   * looks into the ArrayList of publications to check out a certain publication for a certain patron
   *
   * @param publicationindex    the index of the publication
   * @param patronIndex         the index of the patron
   *
 */
  
  public void checkOut(int publicationindex, int patronIndex)
  {
	
   (publications.get(publicationindex)).checkOut(patrons.get(patronIndex));
   
  }


/**
 * Prints out the list of publications for the user to choose
 *
*/


  @Override 
  public String toString()
  {
    int j = 0;

    System.out.println(name);
    System.out.println();


    for(Publication i : publications)
    {
      System.out.println("(" + j + i);
      j++;
    }

    return "\n";


  }
  

}


