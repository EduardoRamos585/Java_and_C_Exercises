public class Line {
   private double x1;
   private double y1;
   private double x2;
   private double y2;
   private Color color;

   public Line ( double x1 , double y1 , double x2 , double y2 , Color color)
   {
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
      this.color = color;

   }

   public double Length ()
   {
	double R1 = Math.pow((x1-x2),2);
	double R2 = Math.pow((y1-y2),2);
	return Math.sqrt(R1+R2);  

   }

   @Override
   public String toString()
   {
     return color + " (" + x1 +"," + y1 + ") " + "-" + " (" + x2 + "," + y2 + ") " + " has length "; 
   }

}


   
   
   
    
   

