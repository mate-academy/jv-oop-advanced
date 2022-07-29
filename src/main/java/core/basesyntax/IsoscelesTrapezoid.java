package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (sideA * sideB / 2) * height;
    }

    @Override
    public String draw() {
        return "isosceles trapezoid, area: " + getArea()
                + " sq.units, sideA: " + sideA + ", sideB: "
                + height + ", color: " + getColor();
    }
}
