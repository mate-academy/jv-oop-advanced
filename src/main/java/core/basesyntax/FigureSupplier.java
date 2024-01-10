package core.basesyntax;

import java.util.Random;

public abstract class FigureSupplier implements Figure, Draw {

    public int getDefaultRadius() {
        int radius;
        radius = 10;
        return radius;
    }

    public int getRandomFigure() {
        //for the generation of figures with episodic powers
        int randvalues = new Random().nextInt(4) + 1;
        return randvalues;
    }

    public String getDefaultColor() {
        String color;
        color = "white";
        return color;
    }
}
