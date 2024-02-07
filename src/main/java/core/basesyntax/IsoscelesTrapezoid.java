package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int baseFirst;
    private final int baseSecond;
    private final int height;

    public IsoscelesTrapezoid(String color, int baseFirst, int baseSecond, int height) {
        super(color);
        this.baseFirst = baseFirst;
        this.baseSecond = baseSecond;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((baseFirst + baseSecond) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + getArea()
                        + " sq.units, side1: " + baseFirst
                        + " units, side2: " + baseSecond + " units, height: " + height
                        + " units, color: " + getColor()
        );
    }
}
