package org.example;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(Color color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Shape: square, area: " + area() + "sq. units, side: " + base
                + "sq. units, height: " + "sq. color: " + getColor());
    }
}
