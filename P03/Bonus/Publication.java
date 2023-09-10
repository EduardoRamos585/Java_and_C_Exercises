import java.time.LocalDate;

public class Publication
{
   private String title;
   private String author;
   private int copyright;
   private String loanedTo;
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

   public void checkOut( String patron)
   {
    this.loanedTo = patron;
    this.dueDate = dueDate.now().plusDays(14);

   }

   public void checkIn()
   {

   }

   @Override 
   public String toString()
   {
     if(loanedTo == null )
     {

        return " " + author + " ," + "copyright : " + copyright + ", " + '"' +  title + '"';
     }
     else
     {
        return " " + author + " ," + "copyright : " + copyright + ", " + '"' + title + '"' + " -->" + " loaned to " + loanedTo + " until " + dueDate;
     }

      
     
   }


    
  

}

