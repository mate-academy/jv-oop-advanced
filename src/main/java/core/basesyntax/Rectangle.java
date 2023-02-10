package core.basesyntax;

public class Rectangle extends Figure implements  AreaCalculator, Drawable {
    private final int length;
    private final int width;

    public Rectangle(int length, int width, Color color) {
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
        System.out.println("Figure: " + "rectangle" + ", area: " + getArea()
                + ", length: " + length + ", width: " + width + ", color: " + getColor());
    }
}
