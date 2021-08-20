package core.basesyntax.model;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: Rectangle, area: ")
                        .append(calculateArea())
                        .append(" sq.units, side: ")
                        .append(getWidth())
                        .append(" units, other side: ")
                        .append(getHeight())
                        .append(", color: ")
                        .append(getColor()));
    }
}
