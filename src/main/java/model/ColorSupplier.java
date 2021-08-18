package model;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        return model.Color.values()[random.nextInt(Color.values().length)];
    }
}



