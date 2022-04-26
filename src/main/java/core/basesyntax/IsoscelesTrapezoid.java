package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawable {
    double firstBase;
    double secondBase;
    double height;

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid " + getArea()
                + "sq.units, first base: " + firstBase
                + "units, second base: " + secondBase
                + "units, height: " + height
                + "units, color: " + getColor());
    }
}
