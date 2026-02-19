package core.basesyntax;
public class Circle extends AbstractFigure implements Figure, Drawable {
    private static final double PI = 3.14159;
    private int radius;
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double area() {
        return PI * radius * radius;
    }
    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, area: " + area() +
                        " sq. units, radius: " + radius +
                        " units, color: " + getColor()
        );
    }
}
