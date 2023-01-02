package core.basesyntax;

public class RightTriangle extends Figure {
    private double width;
    private double height;

    RightTriangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public void print() {
        System.out.println(
                new StringBuilder("Figure: right triangle, area: ")
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


