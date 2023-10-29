package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(Color color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle "
                + " area " + calculateArea() + " sq.units,"
                + " heigth " + height + " units"
                + " width " + width + " units"
                + " color " + getColor());
    }
}
