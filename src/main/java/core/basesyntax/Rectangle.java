package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: rectangle, area: %.2f sq. units, "
                        + "first side: %.2f units, "
                        + "second side: %.2f units, "
                        + "color: %s",
                getArea(), firstSide, secondSide, super.color));
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
