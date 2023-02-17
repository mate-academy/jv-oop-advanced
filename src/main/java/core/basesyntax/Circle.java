package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        System.out.println("Figure: circle, area : " + getArea() + "sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
