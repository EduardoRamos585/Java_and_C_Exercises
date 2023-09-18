package library;
/**
 * Creates an object Patron to hold the information of a certain patron
 *
 *@author Eduardo Ramos
 * 
 *
 * @version 1.0
 *
 * @since 1.0
 *
 * @license.agreement Gnu General Public License 3.0
*/



public class Patron 
{
  private String name;
  private String email;



  public Patron(String name, String email)
  {
    this.name = name;
    this.email = email;
  }
/**
 *Prints out the name and email of the patron
 *
 *
 *@param none
 *
*/
  @Override
  public String toString()
  {
   return " " + name + " email: " + email;
  }


}

