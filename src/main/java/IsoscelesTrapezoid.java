import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private final int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        super(color,"isosceles trapezoid");
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units"
                + ", sideA: " + sideA + " units, sideB: " + sideB + " units , height: "
                + height + " units, color: " + getColor();
    }
}
