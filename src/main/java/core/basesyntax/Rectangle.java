package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private String color;
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public void draw() {
        System.out.println("Rectangle - Color: " + color
                + ", Length: " + length + ", Width: " + width + ", Area: " + getArea());
    }
}
