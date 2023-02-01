package core.basesyntax;

public class Rectangle extends Shape implements Drawable, Figure {
    // rectangle area formula is length x width
    // area = l * w;
    private int length;
    private int width;

    @Override
    public void draw() {
        System.out.println();
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
