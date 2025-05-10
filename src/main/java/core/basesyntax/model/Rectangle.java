package core.basesyntax.model;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(String color, int width, int length) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq. units, color: " + getColor() + ", width: " + width
                        + ", length: " + length);
    }
}
