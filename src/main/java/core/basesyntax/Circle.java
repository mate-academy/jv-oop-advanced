package core.basesyntax;

import abstracts.FigureAbstract;
import enums.Color;

public class Circle extends FigureAbstract {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);

        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + this.getArea()
                + " sq. units, "
                + "radius: "
                + this.getRadius()
                + " units, color: "
                + this.getColor());
    }
}
