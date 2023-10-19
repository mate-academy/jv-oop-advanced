package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int baseLength;
    private final int smallerSideLength;
    private final int height;

    public IsoscelesTrapezoid(String color, int baseLength, int smallerSideLength, int height) {
        super(color);
        this.baseLength = baseLength;
        this.smallerSideLength = smallerSideLength;
        this.height = height;
    }

    @Override
    public void obtainTheArea() {
        setArea((double) (baseLength + smallerSideLength) / 2 * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, baseLength: " + baseLength + "units, smallerSideLength: "
                + smallerSideLength + "units, height: " + height + " units, color: "
                + getColor().toLowerCase());
    }
}
