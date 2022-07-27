package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int high;
    private final int upbase;
    private final int downbase;

    public IsoscelesTrapezoid(int leg, int upbase, int downbase, String color) {
        this.high = leg;
        this.upbase = upbase;
        this.downbase = downbase;
        setColor(color);
    }

    @Override
    public Double getAreaCalculator() {
        return (double)((upbase + downbase) / 2 * high);
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getAreaCalculator()
                + " sq.units, high: " + high + " units, upbase: "
                + upbase + " units, downbase: " + downbase + " units, color: "
                + super.getColor());
    }
}
