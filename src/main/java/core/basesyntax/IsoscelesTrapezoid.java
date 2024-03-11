package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final int sideLengthA;
    private final int sideLengthB;
    private final int height;

    public IsoscelesTrapezoid(int sideLengthA, int sideLengthB, int height) {
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.height = height;
    }

    public IsoscelesTrapezoid(String color, int sideLengthA, int sideLengthB, int trHeight) {
        this.color = color;
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.height = trHeight;
    }

    @Override
    public double getArea() {
        return ((sideLengthA + sideLengthB) / 2 * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq. units, sideLengthA: " + sideLengthA + " units, sideLengthB: "
                + sideLengthB + ", color: " + color);
    }
}
