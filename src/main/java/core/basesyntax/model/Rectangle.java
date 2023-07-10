package core.basesyntax.model;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(int width, int length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle , area: " + getArea() + " m2, " + "width: "
                + width + " m, " + "length: " + width + " m, " + " color: " + getColor());
    }
}
