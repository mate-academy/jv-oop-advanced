package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
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
