package core.basesyntax;

public class RightTriangle extends Figure {

    private int firstSide;
    private int secondSide;

    public RightTriangle(int firstSide, int secondSide, String figureColor) {
        super(figureColor);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getArea() {
        double area = (double) (firstSide * secondSide) / 2;
        return area;
    }

    public void drawInfo() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, first side: "
                + firstSide + ", second side: " + secondSide + ", color: " + getFigureColor());
    }

}
