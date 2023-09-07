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
    int j = 0;

    System.out.println(name);

    for(Publication i : publications)
    {
      System.out.println("(" + j + i);   
    }

    return "\n";




  }
  





}

