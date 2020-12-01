package core.basesyntax;

public class Rectangle extends Figures implements Drawable {
    private int sideLength;

    public Rectangle(Colors color, int area, int sideLength) {
        super(color, area);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn");
    }

    @Override
    public String toString() {
        return "Shape: rectangle, area: "
                + getArea() + " sq. units, side length: "
                + getSideLength() + " units, color: " + getColor().toLowerCase();
    }
}
