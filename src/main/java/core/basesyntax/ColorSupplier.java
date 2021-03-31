package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int MAX_NUM_FOR_COLOR = 10;
    String[] colors = {"red", "blue", "yellow", "green", "white",
                       "pink", "violet", "black", "orange", "grey"};

    public String getColor() {
        Random ranColor = new Random();
        String color = "";
        for (int i = 0; i < colors.length; i++) {
            color = colors[ranColor.nextInt(10)];
        }
        return color;
    }
}
