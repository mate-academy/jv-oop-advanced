package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setType("Circle");
        setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void drawFigure() {
        System.out.println(new StringBuilder().append("Figure: ")
                .append(getType())
                .append(", Area: ")
                .append(getArea())
                .append(" sq.units")
                .append(", radius: ")
                .append(radius)
                .append(" units")
                .append(", color: ")
                .append(getColor()));
    }
}
