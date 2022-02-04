package core.basesyntax;

public class Rectangle extends Figure {

    protected double width;
    protected double height;

    public Rectangle(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder()
                .append("Figure: rectangle, area: ")
                .append(String.format("%.1f", getArea()))
                .append(" sq.units, width: ")
                .append(String.format("%.1f", width))
                .append(" units, height: ")
                .append(String.format("%.1f", height))
                .append(" units, color: ")
                .append(this.color).toString());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
