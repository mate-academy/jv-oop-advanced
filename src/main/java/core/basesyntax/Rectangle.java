package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int height;

    public Rectangle(String color, int length, int height) {
        super(color);
        this.length = length;
        this.height = height;
    }
    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Rectangle: length = " + length + ", height = " + height
                + ", area = " + getArea() + ", color - " + getColor());
    }
}
