package core.figureclasses;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private final int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println("Figure: " + this.name + ", area: " + decimalFormat.format(area())
                + " sq.units, radius: " + radius + " units, " + "color: " + this.color);
    }
}
