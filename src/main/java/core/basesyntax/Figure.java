package core.basesyntax;

import java.util.Random;

public abstract class Figure implements Figuring {
    private Color color;
    private double area;

    public abstract double getArea();

    @Override
    public Color getColor() {
        return color;
    }

    public void setColor() {
        int randomGenaratedIndex = new Random().nextInt(Color.values().length);
        this.color = Color.values()[randomGenaratedIndex];
    }

    @Override
    public String toString() {
        return "Figure: ";
    }
}
