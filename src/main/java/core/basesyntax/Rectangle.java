package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int a, int b, String color) {
        this.length = a;
        this.width = b;
        this.color = color;
    }

    public void setlength(int a) {
        this.length = a;
    }

    public void setWidth(int b) {
        this.width = b;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public int countArea() {
        return length * width;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle\n\tcolor - " + this.color + ";"
                + "\n\t area - " + this.countArea() + " sq. units;"
                + "\n\t length - " + this.length + " units;"
                + "\n\t width - " + this.width + " units.";
    }
}
