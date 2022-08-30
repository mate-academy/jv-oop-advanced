package core.basesyntax.colorsupplier;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;

import java.util.Random;

public class ColorSupplier {

    public ColorSupplier() {
    }

    public static Figure getDefaultFigure() {
        return new Circle();
    }

    public static String getRandomColor() {
        int index = new Random().nextInt(ColorFigure.values().length);
        return String.valueOf(ColorFigure.values()[index]);
    }
}