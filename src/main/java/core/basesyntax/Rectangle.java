package core.basesyntax;

public class Rectangle extends Figure {
    private Color color;
    private int height;
    private int width;

    public Rectangle(Color color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void print() {
        System.out.println("Figure: Square "
                + " area " + getArea() + " sq.units,"
                + " heigth " + height + " units"
                + " width " + width + " units"
                + " color " + color);
    }
}
