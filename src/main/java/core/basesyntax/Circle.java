package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + color);
    }
}
