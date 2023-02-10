package core.basesyntax;

public class Rectangle extends Figure {
    private static final String NAME = "rectangle";
    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        setColor(color);
        setName(NAME);
        calculateArea();
    }

    public Rectangle() {
        setName(NAME);
    }

    @Override
    public void calculateArea() {
        setArea(length * width);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                + "area: " + getArea() + " sq.units, "
                + "length: " + length + " units, width: " + width + " units,"
                + "color: " + getColor()
        );
    }
}
