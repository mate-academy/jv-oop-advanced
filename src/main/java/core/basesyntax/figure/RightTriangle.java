package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private int hypotenuse;
    private int leg;

    public RightTriangle(String color, int hypotenuse, int leg) {
        super(color);
        this.leg = leg;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return hypotenuse * leg / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, "
                + "hypotenuse: %d units, leg: %d units, "
                + "color: %s\n", "right triangle", getArea(), hypotenuse, leg, getColor());
    }
}
