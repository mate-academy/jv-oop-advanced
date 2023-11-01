package core.basesyntax.figures;

import java.util.Random;

public abstract class Figure implements Drawable, Calculatable, PrettyPrintable {
    protected String color;
    public static double getRandomLength(Random random, int maxLength) {
        return random.nextDouble()*maxLength;
    }

    protected Figure(String color) {
        this.color = color;
    }
}
