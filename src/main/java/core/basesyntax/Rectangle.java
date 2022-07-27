package core.basesyntax;

public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public void setlength(int a) {
        this.a = a;
    }

    public void setWidth(int b) {
        this.b = b;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return this.a;
    }

    public int getWidth() {
        return this.b;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public int countArea() {
        return a * b;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle\n\tcolor - " + this.color + ";"
                + "\n\t area - " + this.countArea() + " sq. units;"
                + "\n\t length - " + this.a + " units;"
                + "\n\t width - " + this.b + " units.";
    }
}
