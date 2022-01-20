package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void drawFigure() {
        System.out.println(new StringBuilder().append("Figure: rectangle, area: ").append(getArea())
                .append(" sq.units, height: ").append(height).append(" units, width: ")
                .append(width).append(" units, color: ").append(getColor()).toString());
    }
}
