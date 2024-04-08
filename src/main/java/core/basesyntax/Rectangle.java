package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return this.length * this.width;
    }

    @Override
    void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq. units, length: "
                + this.length + " units, width: " + this.width + " units, color: "
                + super.getColor());
    }
}
