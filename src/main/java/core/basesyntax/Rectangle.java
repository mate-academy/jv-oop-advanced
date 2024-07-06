package core.basesyntax;

public class Rectangle {
    private int length;
    private int width;

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

    public int getArea() {
        return getLength() * getWidth();
    }
}
