package core.basesyntax;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(getArea() + radius + "color:" + color);
    }
}
