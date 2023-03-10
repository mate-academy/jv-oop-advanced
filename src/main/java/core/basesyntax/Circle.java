package core.basesyntax;

public class Circle implements Figure {
    private final FigureColor color;
    private final int radius;

    public Circle(FigureColor color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: radius = "
                + radius + ", color = "
                + color
                + ", area = "
                + getArea() + " sq.units.");
    }
}
