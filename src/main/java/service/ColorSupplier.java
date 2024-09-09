package service;

import base.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random rand = new Random();

    public String getRandomColor() {
        int index = rand.nextInt(Color.values().length);
        Color color = Color.values()[index];

        return color.name();
    }
}
