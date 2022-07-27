package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area {
    private final int high;
    private final int upbase;
    private final int downbase;

    public IsoscelesTrapezoid(int leg, int upbase, int downbase, String color) {
        this.high = leg;
        this.upbase = upbase;
        this.downbase = downbase;
        super.setColor(color);
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + this.getArea() + " sq.units, high: "
                + high + " units, upbase: " + upbase + " units, downbase: " + downbase
                + " units, color: " + super.getColor();
    }

    @Override
    public Double getArea() {
        return (double)((upbase + downbase) / 2 * high);
    }

}
