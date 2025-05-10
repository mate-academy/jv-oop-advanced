package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color);
        this.firstBase = baseA;
        this.secondBase = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.1f", getArea())
                + " sq. units, first base: " + firstBase + " units second base : " + secondBase
                + " units, color: " + getColor());
    }
}
