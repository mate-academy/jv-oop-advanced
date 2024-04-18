package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int baseOne;
    private final int baseTwo;
    private final int height;

    public IsoscelesTrapezoid(int base1, int base2, int height, String color) {
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
