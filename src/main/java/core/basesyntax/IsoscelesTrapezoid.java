package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

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
    public void print() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
