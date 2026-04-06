package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    Circle(int radius, Color color) {
        this.radius = radius;
        super.setColor(color.toString());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea()
                + ", radius: " + radius
                + ", color: " + getColor();
    }
}
