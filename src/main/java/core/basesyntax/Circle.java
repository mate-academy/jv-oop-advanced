package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        double a = Math.PI * radius * radius;
        return (int)a;
    }

    @Override
    public String draws() {
        return "Figure: Circle, area: " + getArea() + " sq. units, radius: " + radius
                + " units, color: " + color;
    }

    @Override
    public String toString() {
        return draws();
    }
}
