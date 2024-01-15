package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int midline;
    private final int high;

    public IsoscelesTrapezoid(String color, int midline, int high) {
        super(color);
        this.midline = midline;
        this.high = high;
    }

    @Override
    public double getArea() {
        return midline * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid; color: " + color
                + "; midline: " + midline
                + "; high: " + high
                + "; area: " + getArea());
    }
}
