package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private final int radius;

    public Circle(String name, Color color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        DecimalFormat formatter = new DecimalFormat("0.#");
        System.out.println("Figure: " + getName()
                + ", area: " + formatter.format(getArea())
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
