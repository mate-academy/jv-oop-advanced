package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double lowerBase;
    private final double upperBase;
    private final double height;

    IsoscelesTrapezoid(String color, double lowerBase, double upperBase, double height) {
        setColor(color);
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    @Override
    public double obtainArea() {
        return (lowerBase + upperBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + obtainArea()
                + " sq. units, height: "
                + height + ", lower base: " + lowerBase + ", upper base: " + upperBase
                + ", color: " + getColor());
    }
}
