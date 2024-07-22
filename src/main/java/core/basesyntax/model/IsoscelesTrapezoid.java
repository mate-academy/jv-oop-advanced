package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double baseFirst;
    private double baseSecond;
    private double height;

    public IsoscelesTrapezoid(String color, double baseFirst, double baseSecond, double height) {
        super(color);
        this.baseFirst = baseFirst;
        this.baseSecond = baseSecond;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseFirst * baseSecond) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + baseFirst + " units, base2: " + baseSecond
                + " units, height: " + height + " units, color: " + getColor());
    }
}
