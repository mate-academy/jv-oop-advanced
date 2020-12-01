package core.basesyntax;

public class Square extends Shape implements Figure {
    private int sideLength;
    private String color;

    public Square(int sideLength, String color) {
        this.sideLength = sideLength;
        this.color = color;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void draw() {
        System.out.println("Draw the square");
    }

    public double getArea() {
        return sideLength * sideLength;
    }

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
