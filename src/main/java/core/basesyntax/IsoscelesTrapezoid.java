package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseOne;
    private int baseTwo;
    private int height;

    public IsoscelesTrapezoid(Color color, int baseOne, int baseTwo, int height) {
        super(color);
        this.color = color;
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
    }

    @Override
    public void draw() {
        String line = "Figure: Trapezoid, area: ";
        System.out.println(line + calculateArea() + ", 1: " + baseOne + ", 2: " + baseTwo + ", 3: " + height + ", color: " + color);
    }

    @Override
    public double calculateArea() {
        return (baseOne + baseTwo) / 2 * height;
    }
}
