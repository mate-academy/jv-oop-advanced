package core.basesyntax.model;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(Color color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, width: " + width + " units,"
                + " height: " + height + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
