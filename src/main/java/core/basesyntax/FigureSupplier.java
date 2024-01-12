package core.basesyntax;

import java.util.Random;

public abstract class FigureSupplier implements Figure, Drawable {

    public int getRandomFigure() {
        int randvalues = new Random().nextInt(4) + 1;
        return randvalues;
    }

    public static Circle getDefaultFigure() {
        int radius = 10;
        String color = "white";
        return new Circle(radius, color);
    }

}
