package core.basesyntax;

public class Rectangle extends Figure implements GetArea {
    private double sideA;
    private double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String printInfo() {
        return "Figure: rectangle, area: " + Math.floor(getArea() * 100) / 100
                + " sq.units, first side: " + getSideA() + " units, second side: "
                + getSideB() + " units, color: " + getColor();
    }
}
