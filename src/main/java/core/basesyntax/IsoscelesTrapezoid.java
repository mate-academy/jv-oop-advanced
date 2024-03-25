package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double sideB;
    private double sideA;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public String draw() {
        return "Figure: isoscelesTrapezoid, area " + String.format("%.1f", getArea())
                + " sq. units, side A: " + String.format("%.1f", sideA) + " units, side B: "
                + String.format("%.1f", sideB) + " units, height: " + String.format("%.1f", height)
                + " units, color: " + getColor();
    }
}
