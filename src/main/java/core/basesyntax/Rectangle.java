package core.basesyntax;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle() {
        super();
        this.sideA = (int) Math.random() * (11 - 1) + 1;
        this.sideB = (int) Math.random() * (11 - 1) + 1;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return sideA * 2 + sideB * 2;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, perimeter: " + getPerimeter() +
                ", area: " + getArea() +
                " sq. units, sideA: " + getSideA() +
                " units, sideB: " + getSideB() +
                " units, diagonal: " + getDiagonal() +
                " units, color: " + getColor() + ".");
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }
}
