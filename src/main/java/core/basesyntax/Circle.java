package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public String draw() {
        return String.format(Pen.TEMPLATE, FigureName.CIRCLE.name().toLowerCase(), getArea(),
                String.format("radius: %d units", radius), getColor());
    }
}
