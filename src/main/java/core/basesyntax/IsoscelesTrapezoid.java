package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double baseLength1;
    private final double baseLength2;
    private final double height;

    public IsoscelesTrapezoid(String color, double baseLength1, double baseLength2, double height) {
        super(color);
        this.baseLength1 = baseLength1;
        this.baseLength2 = baseLength2;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, baseLength1: "
                + baseLength1 + " sq.units, baseLength2: "
                + baseLength2 + " sq.units, height"
                + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (baseLength1 + baseLength2) * height / 2;
    }
}
