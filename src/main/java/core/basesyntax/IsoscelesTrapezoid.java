package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double topParallel;
    private final double downParallel;
    private final double high;

    public IsoscelesTrapezoid(String color, double topParallel, double downParallel, double high) {
        super(color);
        this.topParallel = topParallel;
        this.downParallel = downParallel;
        this.high = high;
    }

    @Override
    public double getArea() {
        return ((double) (topParallel + downParallel) / 2) + high;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea() + " sq.units, top parallel: "
                + topParallel + " units, down parallel: " + downParallel
                + " units, high: " + high + " units, color: " + getColor();
    }
}
