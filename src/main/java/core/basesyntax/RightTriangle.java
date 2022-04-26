package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawable{
    double base;
    double altitude;

    @Override
    public double getArea() {
        return base * altitude / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle " + getArea()
                + "sq.units, base: " + base
                + "units, altitude: " + altitude
                + "units, color: " + getColor());
    }
}
