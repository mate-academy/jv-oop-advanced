package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int high;
    private final int upbase;
    private final int downbase;

    public IsoscelesTrapezoid(int leg, int upbase, int downbase, String color) {
        super(color);
        this.high = leg;
        this.upbase = upbase;
        this.downbase = downbase;
    }

    @Override
    public double getArea() {
        return (double)((upbase + downbase) / 2 * high);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, high: " + high + " units, upbase: "
                + upbase + " units, downbase: " + downbase + " units, color: "
                + getColor());
    }
}
