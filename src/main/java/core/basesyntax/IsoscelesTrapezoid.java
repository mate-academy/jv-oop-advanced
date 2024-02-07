package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int baseOne;
    private final int baseTwo;
    private final int height;

    public IsoscelesTrapezoid(Color color, int baseOne, int baseTwo, int height) {
        super(color);
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (baseOne + baseTwo) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, Color: " + getColor()
                + ", BaseOne: " + baseOne + ", BaseTwo: " + baseTwo
                + ", Height: " + height + ", Area: " + getArea());
    }
}
