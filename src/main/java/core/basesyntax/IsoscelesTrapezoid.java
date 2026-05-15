package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, Colors color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, First Base: " + firstBase
                + LENGTH_UNITS + ", Second Base: " + secondBase + LENGTH_UNITS
                + ", Height: " + height + LENGTH_UNITS
                + ", Area: " + getArea() + AREA_UNITS
                + ", Color: " + color.name());
    }

    @Override
    public double getArea() {
        double basesSum = firstBase + secondBase;
        double area = 0.5 * basesSum * height;
        return area;
    }
}
