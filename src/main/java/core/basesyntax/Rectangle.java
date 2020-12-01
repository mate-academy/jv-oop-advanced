package core.basesyntax;

public class Rectangle extends Figures {
    private int sideLength;
    private int height;

    public Rectangle(Colors color, int sideLength, int height) {
        super(color);
        this.sideLength = sideLength;
        this.height = height;
    }

    @Override
    public int getArea() {
        return sideLength * height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn");
    }

    @Override
    public String toString() {
        return "Shape: rectangle, area: "
                + getArea() + " sq. units, side length: "
                + sideLength + " units, color: " + getColor().toLowerCase();
    }
}
