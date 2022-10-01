package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;
    private int rectangleArea;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
        getArea();
        draw();
    }

    @Override
    public double getArea() {
        rectangleArea = length * width;
        return rectangleArea;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle; color: " + color
                + "; length: " + length
                + "; width: " + width
                + "; area: " + rectangleArea);
    }
}
