package core.basesyntax;

public class Rectangle extends Figure {
    private String color;
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    public String getName() {
        return "Rectangle";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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
    double area() {
        return this.sideA * this.sideB;
    }

    @Override
    public String drawInfo() {
        return ("Figure: " + getName() + ", " + "area: " + area() + " sq.units, " + "sideA: "
                + getSideA() + " units, " + "sideB: " + getSideB() + " units, " + "color: "
                + getColor());
    }
}
