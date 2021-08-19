package core.basesyntax.figures;

import core.basesyntax.services.AreaCalculator;
import core.basesyntax.services.ColorSupplier;
import core.basesyntax.services.Drawer;

public class Circle extends Figure implements AreaCalculator, Drawer {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
        super.setColor(draw());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return new ColorSupplier().getRandomColor();
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + getRadius() + " units, color: " + super.getColor());
    }
}
