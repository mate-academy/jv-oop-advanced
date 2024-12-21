package core.basesyntax;

public class Ellipse extends Figure {
    private double lengthA;
    private double lengthB;

    public Ellipse(double sideA, double lengthB) {
        this.lengthA = sideA;
        this.lengthB = lengthB;
    }

    @Override
    public double getArea() {
        return Math.PI * lengthA * lengthB;
    }

    @Override
    public String printInformation() {
        return "Figure: Rectangle, area: " + getArea()
                + "sq. units, lengthA: " + lengthA + " units, lengthB: "
                + lengthB + " units, color: " + getColor();
    }
}
