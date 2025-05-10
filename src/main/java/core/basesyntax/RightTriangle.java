package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private final Random random = new Random();
    private final String color = ColorSupplier.getRandomColor();
    private final int sideTriangle = random.nextInt(10);

    @Override
    public String getName() {
        return "rightTriangle";
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * sideTriangle * sideTriangle;
    }

    @Override
    public String getDraw() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure: " + getName()
                + ", area: " + getArea() + " sq.units"
                + ", sideOfSquare: " + sideTriangle + " units"
                +
                ", color: " + getDraw();
    }
}
