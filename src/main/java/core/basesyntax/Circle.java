package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawable {
    double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle " + getArea()
                + "sq.units, radius: " + radius
                + "units, color: " + getColor());
    }
}
