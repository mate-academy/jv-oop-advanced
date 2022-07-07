package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;

public class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String toDraw() {
        return "Figure: circle, area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getRandomColor();
    }
}
