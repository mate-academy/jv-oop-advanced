package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        double rightTriangleArea = FORMULA_INDEX * firstLeg * secondLeg;
        return getFormat(rightTriangleArea);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.RIGHT_TRIANGLE.name().toLowerCase()
                + ", area: " + getArea() + " sq. units, first leg: " + firstLeg
                + ", second leg: " + secondLeg + ", color: " + getColor().toLowerCase());
    }
}
