package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(int firstSide, int secondSide, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.color = color;
    }

    @Override
    public double getArea() {
        return (firstSide * secondSide / 2);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area: " + getArea() + " sq. units"
                        + ", first side: " + firstSide + " units"
                        + ", second side: " + firstSide + " units"
                        + ", color: " + color);
    }
}
