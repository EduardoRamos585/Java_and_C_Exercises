package library;
import java.time.Duration;

/**
 * Creates a class for video publications with additonal info such as runtime
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

public class Video extends Publication{

   private Duration runtime;

/**
 *
 * This constructor inputs the author, copyright, and runtime into the Video object class
 *
 * @param title The name of the publication
 * @param author The name of the author
 * @param copyright The year of copyright
 * @param runtime The amount of runtime in minutes
 *
 */

   public Video (String title, String author , int copyright , int runtime )
   {
	   super(title,author,copyright);
	   this.runtime = Duration.ofMinutes(runtime);
           
	   if( runtime <= 0)
	   {
	     throw new InvalidRuntimeException(title, runtime);
	   }

   
   }


/**
 *
 * Prints out the information contained within each Video class objects.
 *
 *
*/



   @Override
   public String toString()
   {
     return super.toString() + " " + "Total runtime : " + runtime.toMinutes() + " minutes";
   }


}



