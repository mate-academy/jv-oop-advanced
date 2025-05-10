package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(Color color, int width, int length) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle" + ", color: " + getColor()
                + ", width: " + width
                + ", length: " + length
                + ", area: " + calculateArea());
    }
}
