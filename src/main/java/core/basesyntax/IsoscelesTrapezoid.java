package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double heightTrapezoid;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int heightTrapezoid) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.heightTrapezoid = heightTrapezoid;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHeightTrapezoid() {
        return heightTrapezoid;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setHeightTrapezoid(int heightTrapezoid) {
        this.heightTrapezoid = heightTrapezoid;
    }

    @Override
    public double getArea() {
        return ((sideA * sideB) / 2) * heightTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area " + getArea() + " sq.units, "
                + "sideA " + sideA + " units, "
                + "sideB " + sideB + " units, "
                + "height trapezoid " + heightTrapezoid + " units, "
                + "color: " + getColor());
    }
}
