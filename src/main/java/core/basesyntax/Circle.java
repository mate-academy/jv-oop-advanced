package core.basesyntax;

public class Circle extends Figure{
    private int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    String getName() {
        return Figures.CIRCLE.name().toLowerCase();
    }

    @Override
    void infoAboutFigure() {
        System.out.println("Figure: " + getName() + ", area " + area() + " sq.units, radius: "
                + radius + ", color: " + getColor());
    }
}
