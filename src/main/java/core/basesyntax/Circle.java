package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, int radius, String color) {
        this.radius = radius;
        this.name = name;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String printFigure() {
        return "Figure: " + name
                + ", area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + color;
    }
}
