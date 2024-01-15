package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + color);
    }
}

