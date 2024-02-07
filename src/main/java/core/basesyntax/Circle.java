package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String descriptionOfSide() {
        StringBuilder sb = new StringBuilder("Figure: Circle, area: ");
        sb.append(getArea())
                .append(" sq.units, radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(color);
        return sb.toString();
    }
}
