package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static String getRandomColor() {
        String[] colors = new String[] {"red", "green", "yellow", "blue", "black", "white"};
        Random randomColor = new Random();
        return colors[randomColor.nextInt(colors.length)];
    }
}