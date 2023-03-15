package core.basesyntax;

public class Circle extends Figure {
    private String color;
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}
