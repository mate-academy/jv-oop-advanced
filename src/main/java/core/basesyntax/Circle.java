package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    public Circle() {
        setColor("WHITE");
        this.radius = 10;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Figure: Circle, ").append("area: ")
                .append(Double.valueOf(getArea()).toString())
                .append(" sq.units, radius: ")
                .append(Integer.valueOf(radius).toString())
                .append(" units, color: ").append(getColor()).toString();
    }
}
