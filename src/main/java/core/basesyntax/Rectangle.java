package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int a, int b, String color) {
        this.length = a;
        this.width = b;
        setColor(color);
    }

    public void setlength(int a) {
        this.length = a;
    }

    public void setWidth(int b) {
        this.width = b;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    @Override
    public int countArea() {
        return length * width;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle\n\tcolor - " + getColor() + ";"
                + "\n\t area - " + this.countArea() + " sq. units;"
                + "\n\t length - " + this.length + " units;"
                + "\n\t width - " + this.width + " units.";
    }
}
