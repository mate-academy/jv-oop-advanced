package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: rectangle, area: ")
                .append(getArea())
                .append(" sq. units, width: ")
                .append(width)
                .append(" sq. units, length: ")
                .append(length)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder);
    }
}
