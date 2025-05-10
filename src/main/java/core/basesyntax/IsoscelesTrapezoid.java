package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double high;
    private double median;

    public IsoscelesTrapezoid(Color color, double high, double median) {
        super(color);
        this.high = high;
        this.median = median;
    }

    @Override
    public double getArea() {
        return (high * median);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, high: " + high + " units, median: "
                + median + " color: " + getColor());
    }
}
