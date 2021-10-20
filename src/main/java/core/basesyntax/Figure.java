package core.basesyntax;

import java.util.Random;

public class Figure {
    protected static final int MAX_NUMBER = 10;
    protected String color;
    protected double area;
    protected Random random = new Random();

    public Figure() {
        ColorSupplier color = new ColorSupplier();
        this.color = color.getRandomColor();
    }

    @Override
    public String toString() {
        return "Figure: NO NAME, color: "
                + color;
    }
}
