package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: rectangle, area: ").append(getArea())
                .append(" sq.units, height: ").append(height)
                .append(" units, width: ").append(width)
                .append(" units, color: ").append(color.toLowerCase());
        return builder.toString();
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
