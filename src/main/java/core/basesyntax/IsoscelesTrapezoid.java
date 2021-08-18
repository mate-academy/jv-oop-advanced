package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        super.setType("IsoscelesTrapezoid");
        super.setColor(color);
    }

    @Override
    public double area() {
        return ((sideA + sideB) / 2.0) * height;
    }

    @Override
    public void info() {
        System.out.printf("Figure: %s, area: %s sq.units, sideA: %s units, "
                        + "sideB: %s units, height: %s units, color: %s%n", getType(),
                + area(), sideA, sideB, height, getColor());
    }
}
