package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        double area = (firstLeg * secondLeg) / 2;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + area() + " sq.units, "
                + "firstsLeg: " + firstLeg + " secondLeg: " + secondLeg + ", color: " + getColor());
    }
}
