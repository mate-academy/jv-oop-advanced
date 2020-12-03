package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(Math.PI * radius * radius, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, "
                + "radius length: " + getRadius() + " units, "
                + "color = " + getColor());
    }
}
