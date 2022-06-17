package core.basesyntax;

public class Circle extends Figure implements Draw, ObtainArea {
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
        System.out.println("Figure: Circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + color);

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
