package core.basesyntax;

public class Square extends Figure {
    private double leg;

    public Square(Color color, double leg) {
        super("Square", color);
        this.leg = leg;
    }

    @Override
    protected double areaCalculation() {
        return leg * leg;
    }

    @Override
    public String draw() {
        return ("Figure: " + getName() + ", areа: " + areaCalculation()
                + " sq. units, side: " + leg + " units, color: " + getColor());
    }
}
