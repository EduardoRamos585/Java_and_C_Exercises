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

      

      if(copyright < 1900 || copyright > ((this.dueDate).getYear()))
      {
        System.out.println(" Invalid year entered");
      }


   }

   public void checkOut( String patron)
   {
    this.loanedTo = patron;
    this.dueDate = (this.dueDate.now().plusDays(14));

   }

   public void checkIn()
   {

   }

   @Override 
   public String toString()
   {
     
   }




}

