package core.basesyntax;

public class Rectangle extends Figure implements Drawable, AreaCalculator {
    private int length;
    private int width;

    Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    void printColor() {
        super.printColor();
    }


    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq. units, length: " + length + " width: " + width + " units, color: " + getColor());

    }
}
