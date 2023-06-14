package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int firstBase;
    private int secondtBase;
    private int height;
    private String color;

    public IsoscelesTrapezoid(int firstBase, int secondtBase, int height, String color) {
        this.firstBase = firstBase;
        this.secondtBase = secondtBase;
        this.height = height;
        this.color = color;

    }

    @Override
    public double area() {
        return (firstBase + secondtBase) * height * 0.5;
    }

    @Override
    public String canDraw() {
        return String.format("Figure: isosceles trapezoid, area: %.2f sq.units, "
                        + "first base: %d units, second base: %d units,"
                        + " height: %d units, color: %s",
                (firstBase + secondtBase) * height * 0.5, firstBase, secondtBase, height, color);

    }
}
