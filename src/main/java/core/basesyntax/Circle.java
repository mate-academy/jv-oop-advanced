package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String drawFigure() {
        return "Figure: circle, area: " + countArea() + " sq. units, radius "
                + radius + ", color: " + getColor().name().toLowerCase();
    }
}
