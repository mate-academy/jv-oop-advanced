package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: Rectangle, area: ")
                        .append(this.getArea())
                        .append(" sq.units, width: ")
                        .append(width)
                        .append(" units, height: ")
                        .append(height)
                        .append(" units, color: ")
                        .append(this.getColor())
        );
    }
}
