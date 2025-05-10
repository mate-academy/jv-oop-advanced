package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return Figures.CIRCLE.name().toLowerCase();
    }

    @Override
    public void infoAboutFigure() {
        System.out.println("Figure: " + getName() + ", area " + area() + " sq.units, radius: "
                + radius + ", color: " + getColor());
    }
}
