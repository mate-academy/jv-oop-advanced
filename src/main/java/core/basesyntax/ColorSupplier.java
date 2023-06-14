package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private String color = "";

    public String getRandomColor() {
        color = String.valueOf(Color.values()[random.nextInt(Color.values().length)]).toLowerCase();
        return color;
    }
}
