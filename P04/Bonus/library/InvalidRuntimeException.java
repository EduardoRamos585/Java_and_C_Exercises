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
  public InvalidRuntimeException()
  {
	super();   
  }

  public InvalidRuntimeException(String message)
  {
   	super(message);
  }

  public InvalidRuntimeException(String title, int runtime)
  {
     super("Error for video: " + title + " Invalid runtime " + runtime);

  }






}

