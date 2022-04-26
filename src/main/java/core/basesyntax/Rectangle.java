package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawable {
    double length;
    double width;

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle " + getArea()
                + "sq.units, length: " + length
                + "units, width: " + width
                + "units, color: " + getColor());
    }
}
