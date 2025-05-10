package core.basesyntax;

public class RightTriangle extends Figure {
    private double perpendicular;
    private double hypotenuse;
    private double base;

    RightTriangle(String color, double perpend, double hypotenuse, double base) {
        super(color);
        this.perpendicular = perpend;
        this.hypotenuse = hypotenuse;
        this.base = base;
    }

    @Override
    public double getArea() {
        return perpendicular * base * 0.5;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: right triangle, area: %.2f sq.units, "
                        + "perpendicular: %.2f, hypotenuse: %.2f, base: %.2f, color: %s%n",
                this.getArea(), perpendicular, hypotenuse, base, this.getColor());

    }
}
