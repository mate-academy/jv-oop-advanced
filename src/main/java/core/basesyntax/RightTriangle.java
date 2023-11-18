package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        double area = firstLeg * secondLeg * 0.5;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: "
                + calculateArea() + " sq. units, firstLeg: "
                + firstLeg + ", secondLeg: "
                + secondLeg + ", color: "
                + getColor());
    }
}
