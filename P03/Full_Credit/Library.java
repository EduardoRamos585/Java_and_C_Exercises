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
   
  (publications.get(publicationindex)).checkOut(patron);

  }


  @Override 
  public String toString()
  {
   return 
  }
  





}

