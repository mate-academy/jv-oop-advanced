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
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area:"
                + Math.floor(calculateArea()) + " sq.units, "
                + "firstSide: " + firstSide + " units, "
                + "secondSide: " + secondSide + " units, "
                + "color: " + getColor());
    }
}
