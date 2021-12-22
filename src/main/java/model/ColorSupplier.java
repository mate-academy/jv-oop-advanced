package model;

import java.util.Random;

public class ColorSupplier {
    // create random
    private Random random = new Random();

    public ColorOfFigure getRandomColorOfFigure() {
        int index = new Random().nextInt(ColorOfFigure.values().length);
        return ColorOfFigure.values()[index];
    }
}
