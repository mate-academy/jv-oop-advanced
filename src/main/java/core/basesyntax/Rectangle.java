package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private final Random random = new Random();
    private final String color = ColorSupplier.getRandomColor();
    private final int sideARectangle = random.nextInt(10);
    private final int sideBRectangle = random.nextInt(10);

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public double getArea() {
        return sideARectangle * sideBRectangle;
    }

    @Override
    public String getDraw() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure: " + getName()
                + ", area: " + getArea() + " sq.units"
                + ", sideAOfSquare: " + sideARectangle + " units"
                + ", sideBOfSquare: " + sideBRectangle + " units"
                +
                ", color: " + getDraw();
    }
}
