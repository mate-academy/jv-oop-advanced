package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Colors color, int radius) {
        super(Math.PI * radius * radius, color);
        this.radius = radius;
    }

    @Override
    public void drawingFigures() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, "
                + "radius length: " + radius + " units, "
                + "color = " + getColor());
    }
}
