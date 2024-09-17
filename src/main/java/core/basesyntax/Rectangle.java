package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.color = color;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + getArea() + " sq. units"
                        + ", first side: " + firstSide + " units"
                        + ", second side: " + secondSide + " units"
                        + ", color: " + color);
    }
}
