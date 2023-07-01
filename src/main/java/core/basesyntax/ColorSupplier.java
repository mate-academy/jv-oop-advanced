package core.basesyntax;

import java.util.Random;

class ColorSupplier {
   private String[] colors = {"red", "green", "blue", "yellow", "orange", "purple"};
   public String getRandomColor(){
       Random random = new Random();
       int index = random.nextInt(colors.length);
       return colors[index];
   }
}
