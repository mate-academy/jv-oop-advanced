package core.basesyntax;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: circle, area: " + getArea()
                + "sq.units, radius: " + radius
                + "units, color:" + getColor());
    }
}


