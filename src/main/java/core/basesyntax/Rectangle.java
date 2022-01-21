package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double findArea() {
        return length * width;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure, rectangle, area " + findArea() + "sq.units, "
                + "width: " + getWidth() + " " + " length: " + getLength() + " "
                +
                " units, " + " color: " + this.getColor());
    }
}
