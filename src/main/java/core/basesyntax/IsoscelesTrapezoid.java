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
        System.out.println("Figure: trapezoid"
                + ", area: " + getArea() + " sq.units"
                + ", side A: " + this.sideA
                + ", side B: " + this.sideB
                + ", height: " + this.height
                + ", color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return ((this.sideA + this.sideB) / 2.0) * this.height;
    }
}
