package core.basesyntax;

public class Circle extends Figure implements FigureArea {
    private final int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getAreaFigures() {
        return getArea(Math.PI * radius * radius);
    }

    public void printDraw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getAreaFigures() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor());
    }
}
