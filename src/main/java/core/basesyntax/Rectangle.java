package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawable {
    private int length;
    private int width;

    public Rectangle (Color color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, "
                + "area: " + Math.floor(getArea()) + " sq.units, "
                + "length: " + length + " units, "
                + "width: " + width + " units, "
                + "color: " + color.toString().toLowerCase());
    }
}
