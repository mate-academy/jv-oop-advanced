package core.basesyntax.figures;

import java.util.Random;

public abstract class Figure implements Drawable, Calculatable {
    protected String color;
    public static double getRandomLength(Random random, int maxLength) {
        return random.nextDouble()*maxLength;
    }

    protected Figure(String color) {
        this.color = color;
    }

    public String roundDouble(double num) {
        // Prints out only 2 digits after point for doubles
        return String.format("%.2f", num);
    }
}
