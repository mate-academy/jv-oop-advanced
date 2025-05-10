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

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
                + area()
                + "sq. units, baseOne: "
                + baseOne
                + " units, "
                + "baseTwo: "
                + baseTwo
                + " units, "
                + "height: "
                + height
                + " units, "
                + "color: "
                + getColor();
    }

    @Override
    public double area() {
        return (baseOne + baseTwo) * height / 2;
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
}
