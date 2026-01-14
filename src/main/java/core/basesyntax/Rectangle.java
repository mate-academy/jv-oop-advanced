package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide, Colors color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void print() {
        System.out.println(
                "Figure: Rectangle, "
                        + "area: " + getArea() + " sq. units, "
                        + "firstSide: " + firstSide + " units, "
                        + "secondSide: " + secondSide + " units, "
                        + "color: " + getColor().name());
    }
}
