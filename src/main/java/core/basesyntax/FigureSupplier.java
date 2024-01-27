package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Circle getDefaultFigure() {
        int radius = 10;
        String color = "White";
        return new Circle(radius, color);
    }

    public int getRandomFigure() {
        int randValues = new Random().nextInt(4) + 1;
        return randValues;
    }
}
