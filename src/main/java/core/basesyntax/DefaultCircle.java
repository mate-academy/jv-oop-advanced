package core.basesyntax;

public class DefaultCircle extends Figure {
    private final int radius = 10;
    private final String color = "WHITE";

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String toDraw() {
        return "Figure: circle, area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + color;
    }
}
