package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colorList = new String[] { "blue", "red", "green", "purple",
                                            "white", "black", "yellow", "pink",
                                            "orange", "rainbow", "brown" };
        Random number = new Random();
        String color = colorList[number.nextInt(colorList.length)];
        return color;
    }
}
