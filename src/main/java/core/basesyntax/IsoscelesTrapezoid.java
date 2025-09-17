package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double baseFirst;
    private final double baseSecond;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseFirst, double baseSecond, double height) {
        super(color);
        this.baseFirst = baseFirst;
        this.baseSecond = baseSecond;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((baseFirst + baseSecond) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + baseFirst
                + " units, base2: " + baseSecond
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
