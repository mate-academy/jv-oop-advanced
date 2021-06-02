package core.basesyntax;

public class Circle extends Shape implements Printable, Drawable {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double figureArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: circle, area: %s, radius: %s, color: %s%n",
                figureArea(), radius, getColor());
    }
}
