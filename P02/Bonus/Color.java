public enum Color { AUBURN(0xA52A2A), AZURE(0x007FFF), BEIGE(0xF5F5DC),BLOND(0xFAF0BE);

 private int rgb;

 private Color(int rgb)
 {
   this.rgb = rgb;
 }

 @Override
 public String toString()
 {
   return this.name() + " " + rgb;
   
 }

}

