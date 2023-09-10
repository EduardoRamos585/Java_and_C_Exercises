import java.util.ArrayList;

public class Library
{
  private String name;
  private ArrayList <Publication> publications;
  private ArrayList <Patron> patrons;

  public Library (String name)
  {
    this.name = name;

    this.publications = new ArrayList <Publication>();

    this.patrons = new ArrayList <Patron>();
 
  }

  public void addPublication ( Publication publication)
  { 
    
   publications.add(publication);


  }

  public void addPatron(Patron patron)
  {
    patrons.add(patron);
  }


  public String patronMenu()
  {
    int p = 0; 
    System.out.println(" Patrons");
    System.out.println();

    for(Patron i : patrons)
    {
      System.out.println("(" + i + p);
      p++;
    }

    return "\n";



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
    System.out.println();


    for(Publication i : publications)
    {
      System.out.println("(" + j + i);
      j++;
    }

    return "\n";


  }
  

}


