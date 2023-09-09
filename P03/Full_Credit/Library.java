import java.util.ArrayList;

public class Library
{
  private String name;
  private ArrayList <Publication> publications;

  public Library (String name)
  {
    this.name = name;

    this.publications = new ArrayList <Publication>(); 
 
  }

  public void addPublication ( Publication publication)
  { 
    
   publications.add(publication);


  }
  
  public void checkOut(int publicationindex, String patron)
  {


   if(publicationindex > -1 && publicationindex < publications.size())
   {
     (publications.get(publicationindex)).checkOut(patron);
   }
   else
   {
     System.out.println(" Invalid selection, default option in use ");
     publicationindex = 0;
     (publications.get(publicationindex)).checkOut(patron);

   }

   
   

  }


  @Override 
  public String toString()
  {
    int j = 0;

    System.out.println(name);
    System.out.println();


    for(Publication i : publications)
    {
      System.out.println("(" + j + i);
      j++;
    }

    return "\n";




  }
  





}

