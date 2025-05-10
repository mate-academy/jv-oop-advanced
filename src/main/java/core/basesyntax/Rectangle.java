package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;
    private int rectangleArea;

    public Rectangle(String color, int length, int width) {
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
        System.out.println("Figure: rectangle; color: " + color
                + "; length: " + length
                + "; width: " + width
                + "; area: " + getArea());
    }
}
