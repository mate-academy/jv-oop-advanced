package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private int radius;

    {
        name = "circle";
    }

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color.name().toLowerCase();
    }

    public int getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return super.toString()
                + "radius: "
                + getRadius()
                + " units";
    }

    @Override
    public void findArea() {
        area = Math.PI * Math.pow(getRadius(), 2);
    }
}
