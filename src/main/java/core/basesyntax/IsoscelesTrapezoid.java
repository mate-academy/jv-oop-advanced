package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseOne;
    private int baseTwo;
    private int height;

    public IsoscelesTrapezoid(String color, int baseOne, int baseTwo, int height) {
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
                + ", BaseOne: " + baseOne + ", BaseTwo: " + baseTwo + ", Height: " + height + ", Area: " + getArea());
    }
}
