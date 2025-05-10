package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.setRadius(radius);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase() + ", area: "
                + getArea() + " sq.units, radius: " + getRadius() + " units, color: " + getColor());
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
