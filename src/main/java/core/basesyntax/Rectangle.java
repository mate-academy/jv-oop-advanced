package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(String name, String color, double sideA, double sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double obtainArea() {
        return sideA * sideB;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                    + "color: " + getColor() + ", "
                    + "sideA: " + getSideA() + " " + "units, "
                    + "sideB: " + getSideB() + " " + "units, "
                    + "area: " + obtainArea() + " " + "sq.units");

    }
}
