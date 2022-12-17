package core.basesyntax;

public class Circle implements Figure {
    private final Color color;
    private double radius;

    public Circle(Color color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + this.getArea()
                + " sq. units, radius: " + radius + " units, color: " + color);
    }

}
