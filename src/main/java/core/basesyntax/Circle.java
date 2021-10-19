package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        setColor(color);
        this.radius = radius;
        setArea(Math.PI * radius * radius);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor());
    }
}
