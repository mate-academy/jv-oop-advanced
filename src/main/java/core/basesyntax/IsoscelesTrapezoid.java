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
    public double getArea() {
        return 0.5 * (sideA + sideB) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, height: " + height
                + " units, color: " + getColor());
    }
}
