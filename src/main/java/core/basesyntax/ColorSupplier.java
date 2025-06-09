package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
     private enum Colors{
        RED,
        BLUE,
        GREEN,
        WHITE,
        BLACK,
        YELLOW,
        BROWN
    }

    @Override
    public String toString() {
        return "default";
    }

  private final Colors[] colors = {Colors.RED, Colors.BLACK, Colors.GREEN, Colors.BROWN, Colors.WHITE,
                                   Colors.BLUE, Colors.YELLOW};

  public  String getRandomColor() {
      return (colors[new Random().nextInt(colors.length)].toString());
    }

}
