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

/**
 * This constructor stores the name and the email of the patron
 *@param name   The name of the patron
 *@param email  The email of the patron
*/

  public Patron(String name, String email)
  {
    this.name = name;
    this.email = email;
  }
/**
 *Prints out the name and email of the patron
 *
 *@return  A string that contains a message
 *
 *
*/
  @Override
  public String toString()
  {
   return " " + name + " email: " + email;
  }


}

