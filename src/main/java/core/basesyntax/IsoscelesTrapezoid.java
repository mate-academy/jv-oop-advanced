package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int upperBase;
    private final int lowerBase;
    private final int height;

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) ((upperBase + lowerBase) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " +
                getArea() + " sq.units, upperBase: " +
                upperBase + " units, lowerBase: " +
                lowerBase + " units, height: " +
                height + " units, color: " +
                getColor());
    }
}
