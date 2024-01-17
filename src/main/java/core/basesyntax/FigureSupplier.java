package core.basesyntax;

import java.util.Random;

public abstract class FigureSupplier implements Figure, Drawable {
    protected int defaultRadius;
    protected String defaultColor;

    public FigureSupplier() {
        this.defaultRadius = 10;
        this.defaultColor = "white";
    }

    public int getRandomFigure() {
        //for the generation of figures with episodic powers
        int randvalues = new Random().nextInt(4) + 1;
        return randvalues;
    }
}
