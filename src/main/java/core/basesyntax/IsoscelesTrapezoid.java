package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle,"
                + " area: " + getArea() + " sq.units"
                + ", sideA: " + sideA
                + ", sideB: " + sideB
                + ", height: " + height
                + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return height * ((double)(sideA + sideB) / 2);
    }
}
