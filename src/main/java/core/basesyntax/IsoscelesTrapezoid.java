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
    public void draw() {
        String line = "Figure: Trapezoid, area: ";
        System.out.println(line + calculateArea() + ", 1: " + baseOne + ", 2: "
                + baseTwo + ", 3: " + height + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return (double) (baseOne + baseTwo) / 2 * height;
    }
}
