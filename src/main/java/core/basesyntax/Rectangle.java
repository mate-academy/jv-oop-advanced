package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private String name;

    public Rectangle(double sideA, double sideB, String name, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
