package library;
import java.time.Duration;

public class Video extends Publication{

   private Duration runtime;



   public Video (String title, String author , int copyright , int runtime )
   {
	   super(title,author,copyright);
	   this.runtime = Duration.ofMinutes(runtime);
   
   }



   @Override
   public String toString()
   {
     return toString() + runtime;
   }


}



