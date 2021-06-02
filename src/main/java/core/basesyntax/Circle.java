package core.basesyntax;

public class Circle extends Shape {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double figureArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void drawFigure() {
        System.out.println(String.format("Figure: circle, area: %s, radius: %s, color: %s",
                figureArea(), radius, color));
    }
}
