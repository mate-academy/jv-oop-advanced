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
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, baseOne: "
                + baseOne + ", baseTwo: " + baseTwo + ", height: "
                + height + ", color: " + color);
    }

    @Override
    public double getArea() {
        return (baseOne + baseTwo) * height / 2;
    }
}
