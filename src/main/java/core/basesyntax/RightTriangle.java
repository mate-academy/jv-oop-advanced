package core.basesyntax;

public class RightTriangle extends Figure {
    private double leg;
    private double height;

    public RightTriangle(Color color, double leg, double height) {
        super(color);
        this.leg = leg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * leg * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: "
                + getArea() + " sq.units, leg: "
                + leg + " units, height; "
                + height + " color: "
                + getColor().name().toLowerCase());
    }
}
