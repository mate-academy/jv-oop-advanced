package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        setColor(color);
    }

    public void setlength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public int countArea() {
        return length * width;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle\n\tcolor - " + getColor() + ";"
                + "\n\t area - " + countArea() + " sq. units;"
                + "\n\t length - " + length + " units;"
                + "\n\t width - " + width + " units.";
    }
}
