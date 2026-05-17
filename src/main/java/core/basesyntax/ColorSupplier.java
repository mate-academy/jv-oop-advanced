package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
   String[] colors = {"black", "white", "yellow", "blue", "green", "red"};

    public String getRandomColor(){
        return colors[new Random().nextInt(colors.length)];
    }
}
