package core.basesyntax.figures;

public class Rectangle extends AbstractFigure {
    private int length;
    private int width;
    private String color;

    public Rectangle(int length, int width, String color) {
        setWidth(width);
        setLength(length);
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public String getSize() {
        return "length: " + getLength() + " units, " + "width: " + getWidth() + " units,";
    }

    @Override
    public double area() {
        return length * width;
    }
}
