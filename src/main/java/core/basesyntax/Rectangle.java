package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + getArea()
                        + " sq.units, side1: " + firstSide
                        + " units, side2: " + secondSide + " units, color: " + getColor()
        );
    }
}
