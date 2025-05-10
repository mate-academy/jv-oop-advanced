package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseFirst;
    private double baseSecond;
    private double height;

    public IsoscelesTrapezoid(double base1, double base2, double height, String color) {
        super(color);
        this.baseFirst = baseFirst;
        this.baseSecond = baseSecond;
        this.height = height;
    }

    public double getBaseFirst() {
        return baseFirst;
    }

    public double getBaseSecond() {
        return baseSecond;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + areaCalculator()
                + " sq. units, base1: " + baseFirst + " units, base2: "
                + baseSecond + " units, height: " + height + " units, color: " + getColor());
    }

    @Override
    public double areaCalculator() {
        return 0.5 * (baseFirst + baseSecond) * height;
    }
}
