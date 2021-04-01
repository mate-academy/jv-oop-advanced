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
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + this.getArea() + " sq. units, width: " + this.height
                + " units, color: " + this.getColor();
    }
}
