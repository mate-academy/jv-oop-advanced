package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + obtain() + " sq.units, width: " + width
                + " units, height: " + height + " units, color: " + getColor());
    }

    @Override
    public double obtain() {
        return height * width;
    }
}
