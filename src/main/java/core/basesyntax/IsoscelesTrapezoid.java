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

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * height / 2;
    }

    @Override
    public String draw() {
        return "Figure: isoscelesTrapezoid, area: " + getArea() + " sq.units, sideA: "
                + sideA + " units, sideB: " + sideB + " units, height: "
                + height + " units, color: " + getColor();
    }
}
