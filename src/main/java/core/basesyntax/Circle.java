package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return radius * radius * Math.PI;
    }

    @Override
    public String getDraw() {

        StringBuilder builder = new StringBuilder();
        builder.append("Figure: circle, area: ")
                .append(getArea()).append(" sq. units, radius: ")
                .append(radius)
                .append(" units, color: ")
                .append(color);
        return builder.toString();
    }
}
