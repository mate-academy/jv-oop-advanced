package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: ");
        stringBuilder.append("rectangle, area: ")
                .append(getArea())
                .append(" sq.units, width: ")
                .append(width)
                .append(" height: ")
                .append(height)
                .append(" color: ")
                .append(color);
        System.out.println(stringBuilder);
    }
}
