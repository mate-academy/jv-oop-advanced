package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private final Random random = new Random();
    private final int sideOfSquare = random.nextInt(10);
    private final String color = ColorSupplier.getRandomColor();

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getArea() {
        return sideOfSquare * sideOfSquare;
    }

    @Override
    public String getDraw() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure: " + getName()
                +
                ", area: " + getArea() + " sq.units"
                +
                ", sideOfSquare: " + sideOfSquare + " units"
                +
                ", color: " + getDraw();
    }
}
