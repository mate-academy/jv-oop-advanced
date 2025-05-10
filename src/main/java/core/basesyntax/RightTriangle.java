package core.basesyntax;

public class RightTriangle extends Figure {
    private final double leg;

    public RightTriangle(String color, double leg) {
        super(color);
        this.leg = leg;
    }

    public double getLeg() {
        return leg;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3.0) / 4.0) * (leg * leg);
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + "right triangle," + " area : " + calculateArea()
                + " sq.units," + " legs : " + getLeg() + " units," + " color : " + getColor());
    }
}
