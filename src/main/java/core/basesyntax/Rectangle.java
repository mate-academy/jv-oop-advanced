package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private final double firstSide = new Random().nextInt(100);
    private final double secondSide = new Random().nextInt(100);
    private final Color color = Color.values()[new Random().nextInt(10)];

    @Override
    public double area() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.area()
                + " sq.units, first side: " + getFirstSide() + " units, second side: "
                + getSecondSide() + " color: " + getColor());
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public Color getColor() {
        return color;
    }
}
