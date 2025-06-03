package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
  private String[] colors = {"red", "blue", "green", "white", "black", "yellow", "brown"};

  public  String getRandomColor() {
      return new String(colors[new Random().nextInt(colors.length)]);
    }

}
