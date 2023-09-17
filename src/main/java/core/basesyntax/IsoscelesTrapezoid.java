package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int largerBase;
    private final int smallerBase;
    private final int height;

    public IsoscelesTrapezoid(Color color, int smallerBase, int largerBase, int height) {
        super(color);
        this.height = height;
        this.largerBase = largerBase;
        this.smallerBase = smallerBase;
    }

    @Override
    public int calculateArea() {
        int result1 = (largerBase + smallerBase) / 2;
        return result1 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, larger base: " + largerBase + " units, smaller  base: "
                + smallerBase + " units, height: " + height + " units, color: "
                + getColor().name());
    }
}
