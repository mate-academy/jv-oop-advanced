package core.basesyntax;

import java.util.Locale;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + this.area()
                + " sq.units, radius: " + this.radius + " units, color: "
                + super.getColor().toLowerCase(Locale.ROOT));
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
