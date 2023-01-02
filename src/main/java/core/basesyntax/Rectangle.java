package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void print() {
        System.out.println(
                new StringBuilder("Figure: rectangle, area: ")
                .append(String.format("%.1f", getArea()))
                .append(" sq.units, width: ")
                .append(width)
                .append(" units, height: ")
                .append(height)
                .append(" units, color: ")
                .append(super.getColor().toLowerCase())
                .toString()
        );
    }
}

