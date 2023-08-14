package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle, area: %.1f sq.units, firstSide: "
                        + "%.1f, secondSide: %.1f, color: %s",
                calculateArea(), getFirstSide(), getSecondSide(), getColor()));

    }
}
