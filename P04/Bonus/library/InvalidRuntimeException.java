package library;

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

