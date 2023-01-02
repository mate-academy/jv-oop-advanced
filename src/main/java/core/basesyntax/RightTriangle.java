package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private final double firstLeg = new Random().nextInt(100);
    private final double secondLeg = new Random().nextInt(100);
    private final Color color = Color.values()[new Random().nextInt(10)];

    @Override
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + this.area()
                + " sq.units, firstLeg: " + getFirstLeg() + " units, secondLeg: "
                + getSecondLeg() + "color: " + getColor());
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public Color getColor() {
        return color;
    }
}
