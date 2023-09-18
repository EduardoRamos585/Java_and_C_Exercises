package library;

import java.time.LocalDate;

/**
 * This class holds the info of the publication such as the title, author, etc
 *
 *@author Eduardo Ramos
 *
 *@version 1.0
 *
 *@since 1.0
 *
 *
 * @license.agreement Gnu General Public License 3.0
*/





public class Publication
{
   private String title;
   private String author;
   private int copyright;
   private Patron loanedTo;
   private LocalDate dueDate;

   public Publication(String title, String author, int copyright)
   {
      this.title = title;
      this.author = author;
      this.copyright = copyright;
      this.dueDate = LocalDate.now();

      

      if(copyright < 1900 || copyright > ((this.dueDate).getYear()))
      {
        throw new IllegalArgumentException("Invalid copyright year");
      }


   }

/**
 * Checks out the publication with the patron class belonging to the patron in question
 *
 *@param The Patron class for the patron checking out the publication
*/

   public void checkOut( Patron patron)
   {
    this.loanedTo = patron;
    this.dueDate = dueDate.now().plusDays(14);

   }

   public void checkIn()
   {

   }


 /**
  *
  * Prints out the information for each Patron class 
  *
  *
  *
*/
   @Override 
   public String toString()
   {
     if(loanedTo == null )
     {

        return " " + author + " ," + "copyright : " + copyright + ", " + '"' +  title + '"';
     }
     else
     {
        return " " + author + " ," + "copyright : " + copyright + ", " + '"' + title + '"' + "\n  -->" + " loaned to " + loanedTo + " until " + dueDate;
     }

      
     
   }
}

