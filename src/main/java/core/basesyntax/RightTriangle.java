package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(double firstLeg, double secondLeg) {
        this.typeOfFigure = TypeOfFigure.RIGHT_TRIANGLE;
        this.area = getTriangleArea(firstLeg, secondLeg);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + typeOfFigure
                + ", area: " + decimalFormat.format(area) + " sq. units, first leg: "
                + decimalFormat.format(firstLeg) + " units, second leg: "
                + decimalFormat.format(secondLeg) + " units, color: " + color);
    }
}
