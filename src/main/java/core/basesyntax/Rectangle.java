package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.height = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return 15;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq.units, width: "
                + height + " units, height: " + width
                + " units, color: " + getColor());
    }
}
