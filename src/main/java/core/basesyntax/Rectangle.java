package core.basesyntax;

public class Rectangle extends Figure implements GetArea {
    private int width;
    private int length;

    public Rectangle(int length, int width, Colour colour) {
        super(colour);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return (length * width);
    }

    @Override
    public void getDraw() {
        System.out.println("Rectangle, area: " + getArea() + " square units, side length: "
                + getLength() + " units, color: " + getColour());
    }
}
