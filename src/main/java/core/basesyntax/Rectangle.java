package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.color = color;
    }

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
}
