package core.basesyntax;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + String.format("%.2f", getArea())
                + " sq. units, width: " + width + " units, height: "
                + height + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
