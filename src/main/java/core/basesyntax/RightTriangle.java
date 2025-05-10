package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getArea() {
        return (double) (firstSide * secondSide) / 2;
    }

    public void drawInfo() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, first side: "
                + firstSide + ", second side: " + secondSide + ", color: " + getFigureColor());
    }

}
