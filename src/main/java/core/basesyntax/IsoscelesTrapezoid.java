package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseOne;
    private double baseTwo;
    private double height;

    public IsoscelesTrapezoid(String color, double baseOne, double baseTwo, double height) {
        super(color);
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
    }

    public double getBaseOne() {
        return baseOne;
    }

    public void setBaseOne(double baseOne) {
        this.baseOne = baseOne;
    }

    public double getBaseTwo() {
        return baseTwo;
    }

    public void setBaseTwo(double baseTwo) {
        this.baseTwo = baseTwo;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseOne + baseTwo) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, base 1: " + baseOne
                + " units, base 2: " + baseTwo + " units, height: " + height
                + " units, area: " + getArea() + " sq. units, color: " + getColor());
    }
}
