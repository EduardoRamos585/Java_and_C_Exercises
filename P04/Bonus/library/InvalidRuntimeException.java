package library;


/**
 *
 * Creates a custom excpetion through chained constructors when an invalid runtime is detected 
 *
 *
 * @author Eduardo Ramos
 *
 * @version 1.0
 *
 * @since 1.0
 *
 * @license.agreement Gnu General Public Agreement 3.0
 *
*/

public class InvalidRuntimeException extends java.lang.ArithmeticException
{


/**
 * The first constructor that builds the custom exception
 *
*/
  public InvalidRuntimeException()
  {
	super();   
  }


/**
 *
 *The second constructor that adds the string message to the exception
 *
 *@param message  The string to be written in the exception
*/
  public InvalidRuntimeException(String message)
  {
   	super(message);
  }

 /**
  * This method prints out the error message in the exception
  *
  *@param title  The title of the video
  *
  *@param runtime The illegal runtime in question
  *
 */


  public InvalidRuntimeException(String title, int runtime)
  {
     super("Error for video: " + title + " Invalid runtime " + runtime);

  }






}

