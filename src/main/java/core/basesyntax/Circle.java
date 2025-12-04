package core.basesyntax;

public class Circle extends AbstractFigure implements Drawable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    protected String getParametersString() {
        return "radius: " + radius;
    }
}

