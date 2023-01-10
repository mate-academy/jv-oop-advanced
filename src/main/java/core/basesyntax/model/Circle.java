package core.basesyntax.model;

import core.basesyntax.supplier.ColorSupplier;

public class Circle extends Figure {
    private int radius;

    public Circle() {
        this.radius = getRandom().nextInt(100);
        setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println(getStringBuilder().append(System.lineSeparator()).append(
                        "This is a CIRCLE ")
                .append(System.lineSeparator()).append("Color is ").append(getColor())
                .append(System.lineSeparator()).append("Radius = ").append(radius)
                .append(System.lineSeparator()).append("Area = ").append(getArea()).toString());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
