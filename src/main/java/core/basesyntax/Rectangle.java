package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private String name;
    private String color;

    public Rectangle() {
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "sideA: " + getSideA()
                + ", " + "sideB: " + getSideB()
                + ", " + "color: " + getColor());
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
