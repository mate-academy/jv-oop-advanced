package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double base;
    private double height;

    public IsoscelesTrapezoid(double base, double height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double obtainArea() {
        return base * height / 2;

    }

    @Override
    public void draw() {
        System.out.println("isoscelesTrapezoid area: "
                + obtainArea()
                + " base: "
                + base
                + " height "
                + height
                + " color: "
                + color);
    }
}
