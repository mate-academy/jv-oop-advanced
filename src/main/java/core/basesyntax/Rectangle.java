package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String printInformation() {
        return "Figure: Rectangle, area: " + getArea()
                + "sq. units, sideA: " + sideA + " units, sideB: "
                + sideB + " units, color: " + getColor();
    }
}
