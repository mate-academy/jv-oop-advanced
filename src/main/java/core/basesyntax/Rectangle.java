package core.basesyntax;

public class Rectangle implements Figure {
    private String color;
    private int length;
    private int width;

    public Rectangle() {
        this.length = length;
        this.width = width;
        this.color = color;

    }

    @Override
    public double getArea() {
        return length * width;
    }
}
