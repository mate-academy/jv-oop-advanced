package core.basesyntax;

public class Circle extends Figure implements FigureArea {
    private final int radius;

    public Circle(int radius, String name, String color) {
        this.radius = radius;
        this.name = name;
        this.color = color;
    }

    public double getArea() {
        return area = Math.PI * radius * radius;
    }

    public void printDraw() {
        System.out.println("Figure: " + name
                + ",area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + color);
    }
}