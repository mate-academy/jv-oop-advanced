package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int sideA;
    private final int sideB;
    private final int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelestrapezoid, area: " + getArea()
                + " sq.units, side A: " + sideA
                + " units, side B: " + sideB
                + " units, height: " + height
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2.0 * height;
    }
}
