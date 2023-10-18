package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA = 0;
    private double sideB = 0;

    Rectangle() {
        super("rectangle", Color.WHITE);
    }

    Rectangle(Color color) {
        super("rectangle", color);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA > 0) {
            this.sideA = sideA;
        } else {
            System.out.println("Rectangle side can't be negative or equal to zero!");
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB > 0) {
            this.sideB = sideB;
        } else {
            System.out.println("Rectangle side can't be negative or equal to zero!");
        }
    }

    public void setSides(double sideA, double sideB) {
        if (sideA > 0 && sideB > 0) {
            this.sideA = sideA;
            this.sideB = sideB;
        } else {
            System.out.println("Rectangle sides can't be negative or equal to zero!");
        }
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        String info = "Figure: " + getName();
        info += ", area: " + area();
        info += " sq.units, sideA: " + sideA;
        info += " units, sideB: " + sideB;
        info += " units, color: " + getColor().name();
        System.out.println(info);
    }
}
