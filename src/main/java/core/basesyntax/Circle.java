package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.floor(Math.PI * radius * radius);
    }

    public void toDraw() {
        System.out.println("circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
