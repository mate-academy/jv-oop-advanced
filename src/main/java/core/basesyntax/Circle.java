package core.basesyntax;

public class Circle extends Figure implements Area {
    private int radius;

    public Circle(int radius, String color) {
        super.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String print() {
        return "Figure: Circle, area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, color: " + color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
