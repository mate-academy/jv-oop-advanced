package core.basesyntax;

import org.w3c.dom.ls.LSOutput;

public class Circle extends Figure implements Area, Draw {
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI* radius * radius);
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius + " units, color "
                + color);
    }
}
