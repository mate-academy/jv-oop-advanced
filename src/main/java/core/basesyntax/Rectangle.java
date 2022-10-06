package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(DiffColor color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, first leg: " + width
                + " units, second leg: " + height
                + " units, color: " + getColor().name().toLowerCase());
    }
}
