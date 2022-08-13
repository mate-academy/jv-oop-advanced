package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void toDraw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Figure: circle, area: "
                + Math.PI * radius * radius
                + " sq.units, radius: "
                + radius
                + " units, color: " + color;
    }
}
