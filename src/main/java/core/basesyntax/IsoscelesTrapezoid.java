package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int sideA;
    private final int sideB;

    public IsoscelesTrapezoid(int height, int sideA, int sideB, String color) {
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, sideA: " + sideA + " units, sideB: "
                + sideB + " units, height: "
                + height + " units, color: " + this.getColor());
    }
}
