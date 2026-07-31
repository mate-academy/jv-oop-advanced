package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int baseOne;
    private final int baseTwo;
    private final int height;

    public IsoscelesTrapezoid(String color, int sideOne, int sideTwo, int height) {
        super(color);
        this.baseOne = sideOne;
        this.baseTwo = sideTwo;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseOne + baseTwo) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, " +
                "1st base: " + baseOne + " units, 2nd base: " + baseTwo + " units, " +
                "height: " + height + ", color: " + color);
    }
}
