package core.basesyntax;

public class RightTriangle extends Figure {
    private double leg;

    public RightTriangle(Color color, double leg) {
        super(color);
        this.leg = leg;
    }

    @Override
    public double calculateArea() {
        return (Math.pow(3, 0.5) / 4) * Math.pow(leg, 2);
    }

    @Override
    public String printInfo() {
        return "Figure: triangle, "
                + "area: " + calculateArea() + " sq.units, "
                + "leg: " + leg + " units, "
                + "color: " + getColor();
    }
}

