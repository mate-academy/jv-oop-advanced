package org.example;

public class IsoscelesTrapezoid extends Figure {
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() +
                " sq. units, first base: " + base1 + " units, second base: " + base2 +
                " units, height: " + height + " units, color: " + getColor());
    }
}

