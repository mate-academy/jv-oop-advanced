package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double median;
    private double high;

    public IsoscelesTrapezoid(Color color, double median, double high) {
        super(color);
        this.median = median;
        this.high = high;
    }

    @Override
    public double getArea() {
        return (high * median);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getArea()
                 + " sq. units, high: " + high + " units, median: "
                 + median + " color: " + getColor());
    }
}
