package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public int area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType() + " area: " + area()
                + "sq.units, length: " + length + " units, width "
                + width + " units, color: " + getColor());
    }

    @Override
    public String getType() {
        return "rectangle";
    }
}
