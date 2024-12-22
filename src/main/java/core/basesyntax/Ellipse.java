package core.basesyntax;

public class Ellipse extends Figure {
    private double lengthA;
    private double lengthB;

    public Ellipse(double sideA, double lengthB, String color) {
        super(color);
        this.lengthA = sideA;
        this.lengthB = lengthB;
    }

    @Override
    public double getArea() {
        return Math.PI * lengthA * lengthB;
    }

    @Override
    public String printInformation() {
        return "Figure: Ellipse, area: " + getArea()
                + "sq. units, lengthA: " + lengthA + " units, lengthB: "
                + lengthB + " units, color: " + getColor();
    }
}
