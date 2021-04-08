package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, String name, int length, int width) {
        super(color, "Rectangle");
        this.width = width;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units,  length: "
                + getLength() + " units, width : " + getWidth() + " units, color: "
                + getColor());
    }
}
