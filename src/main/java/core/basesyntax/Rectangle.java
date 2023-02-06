package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstSide = SIDE;
    private final double secondSide = SIDE;

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
