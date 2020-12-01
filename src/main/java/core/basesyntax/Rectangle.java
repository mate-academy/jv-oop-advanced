package core.basesyntax;

public class Rectangle extends Shape implements Figure {
    private int length;
    private int width;
    private String color;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void draw() {
        System.out.println("Draw the rectangle");
    }

    public double getArea() {
        return length * width;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "rectangle, area: "
                + getArea()
                + " sq. units, length: "
                + length
                + " units, color: "
                + color;
    }
}
