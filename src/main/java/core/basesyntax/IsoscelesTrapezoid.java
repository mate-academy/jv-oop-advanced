package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private final Color color;
    private double high;
    private double median;

    public IsoscelesTrapezoid(Color color, double high, double median) {
        this.high = high;
        this.median = median;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (high * median);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getArea()
                + " sq. units, high: " + high + " units, median: " + median + " color: " + color);
    }
}
