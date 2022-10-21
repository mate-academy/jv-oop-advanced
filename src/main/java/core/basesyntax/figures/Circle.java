package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, String name, int radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " radius: " + radius + " units";
    }
}
