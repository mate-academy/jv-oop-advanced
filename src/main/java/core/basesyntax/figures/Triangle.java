package core.basesyntax.figures;

import core.basesyntax.RandomNumber;

public class Triangle extends Shape {
    private double side;

    public Triangle() {
        super();
        this.side = RandomNumber.getRandomNumber(20);
    }

    @Override
    public double getArea() {
        return (getHeight() * side) / 2;
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.format("Figure: triangle, perimeter: %.2f"
                        + ", area: %.2f"
                        + " sq. units, side: %.2f", getPerimeter(), getArea(), getSide());
        System.out.format(" units, height: %.2f"
                        + " units, color: %s.%n", getHeight(), getColor());

    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2));
    }
}
