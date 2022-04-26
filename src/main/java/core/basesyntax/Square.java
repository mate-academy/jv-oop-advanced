package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    double side;

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square " + getArea()
                + "sq.units, side: " + side
                + "units, color: " + getColor());
    }
}
