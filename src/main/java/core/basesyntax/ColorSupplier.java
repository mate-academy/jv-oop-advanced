package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        final String[] Colors = new String[] {"red", "green", "yellow", "blue", "black", "white"};
        int randomColor = new Random().nextInt(Colors.length);
        return Colors[randomColor];
    }
}
