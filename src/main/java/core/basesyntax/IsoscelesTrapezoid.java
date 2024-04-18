package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double baseOne;
    private final double baseTwo;
    private final double height;

    public IsoscelesTrapezoid(double base1, double base2, double height, Color color) {
        super(color);
        this.baseOne = base1;
        this.baseTwo = base2;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * (baseOne + baseTwo) * height;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + ". It's base length is: " + baseOne + ", it's another base length is: " + baseTwo
                + ". It's height is " + height + ", and it's color is " + color);
    }
}
