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
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: rectangle, area: ").append(getArea())
                .append(" sq.units, height: ").append(height)
                .append(" units, width: ").append(width)
                .append(" units, color: ").append(color.toLowerCase());
        System.out.println(builder);
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
