package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: RightTriangle, area: ")
                        .append(this.getArea())
                        .append(" sq.units, width: ")
                        .append(width)
                        .append(" sq.units, height: ")
                        .append(height)
                        .append(" units, color: ")
                        .append(this.getColor())
        );
    }
}
