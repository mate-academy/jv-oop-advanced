package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int midline;
    private final int high;
    private int isoscelesTrapezoidArea;

    public IsoscelesTrapezoid(String color, int midline, int high) {
        super(color);
        this.midline = midline;
        this.high = high;
        getArea();
        draw();
    }

    @Override
    public double getArea() {
        isoscelesTrapezoidArea = midline * high;
        return isoscelesTrapezoidArea;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid; color: " + color
                + "; midline: " + midline
                + "; high: " + high
                + "; area: " + isoscelesTrapezoidArea);
    }
}
