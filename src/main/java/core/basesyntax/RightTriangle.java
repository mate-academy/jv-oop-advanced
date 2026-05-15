package core.basesyntax;

public class RightTriangle extends Figure {

    private double firstLeg;
    private double secongLeg;

    public RightTriangle(double firstLeg, double secondBase, Colors color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secongLeg = secondBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, First leg: " + firstLeg + LENGTH_UNITS
                + ", Second leg: " + secongLeg + LENGTH_UNITS
                + ", Area: " + getArea() + AREA_UNITS
                + ", Color: " + color.name());
    }

    @Override
    public double getArea() {
        double area = (firstLeg * secongLeg) / 2;
        return area;
    }
}
