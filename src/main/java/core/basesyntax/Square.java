package core.basesyntax;

public class Square extends Shape implements Figure {
    private int sideLength;

    public Square(int sideLength, String color) {
        this.sideLength = sideLength;
        this.color = color;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Draw the square");
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "square, area: "
                + getArea()
                + " sq. units, side length: "
                + sideLength
                + " units, color: "
                + color;
    }
}
