package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg;

    public RightTriangle(int leg, String color) {
        super(color);
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return (leg * leg) * 0.5;
    }

    @Override
    public String toString() {
        return "Figure"
                + ": right triangle"
                + ", area: " + getArea() + " sq.units"
                + ", leg: " + leg + " units"
                + ", color: " + getColorFigure();
    }
}
