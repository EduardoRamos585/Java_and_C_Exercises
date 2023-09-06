public enum Color { AUBURN(0xA52A2A), AZURE(0x007FFF), BEIGE(0xF5F5DC),BLOND(0xFAF0BE);

 private int rgb;

 private Color(int rgb)
 {
   this.rgb = rgb;
 }

 @Override
 public String toString()
 {
   if(rgb ==0xA52A2A)
    {
     return this.name() + "(" + "\033[38;2;165;42;42m " + String.format("0x%x",rgb) + "\033[0m" + ")";
    }
    else if (rgb == 0x007FFF)
    {
     return this.name() + "(" + "\033[38;2;0;127;255m " + String.format("0x%x",rgb) + "\033[0m" + ")";
    }
    else if(rgb == 0xF5F5DC)
    {
     return this.name() + "(" + "\033[38;2;245;245;220m " + String.format("0x%x",rgb) + "\033[0m" + ")";    
    }
    else if(rgb == 0xFAF0BE)
    {
     return this.name() + "(" + "\033[38;2;250;240;190m " + String.format("0x%x",rgb) + "\033[0m" + ")";
    }
    else 
    {
     return this.name() + "(" + String.format("%x",rgb) + ")"; 
    }
 }

}

