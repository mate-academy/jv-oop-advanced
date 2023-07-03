package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index;
    private String color;
    private Random random = new Random();

    public String getRandomColor() {
        index = random.nextInt(Color.values().length);
        color = Color.values()[index].name();
        return color;
    }
}
