package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, int radius, String color) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
