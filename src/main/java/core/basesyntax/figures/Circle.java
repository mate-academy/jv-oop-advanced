package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, int radius, Color color) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    @Override
    public String drawFigure() {
        return super.drawFigure()
                + "radius: "
                + getRadius()
                + " units";
    }

    @Override
    public void findArea() {
        area = Math.PI * Math.pow(getRadius(), 2);
    }
}
