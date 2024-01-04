package core.basesyntax;

import java.util.Random;

public abstract class AbstractFigure implements core.basesyntax.Figure {
    protected Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    public AbstractFigure() {
    }

    public static Color getRandomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)];
    }

    public static Color getDefaultColor() {
        return Color.WHITE;
    }

    public abstract double getArea();

    public abstract void draw();

    public abstract Color getColor();
}
