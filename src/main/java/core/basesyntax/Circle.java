package core.basesyntax;

import java.util.Locale;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + this.getArea()
                + " sq.units, radius: " + this.radius + " units, color: "
                + super.getColor().toLowerCase(Locale.ROOT));
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
