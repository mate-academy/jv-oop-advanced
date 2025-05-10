package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String drawing() {
        return " Figure: rectangle, area: " + getArea() + " sq.units, "
                + "sideA: " + sideA + " units, "
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
