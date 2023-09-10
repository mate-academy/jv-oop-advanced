package core.basesyntax.model;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(Color color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + String.format("%.1f", calculateArea()) // Only for better look
                + " sq.units, height: " + height
                + " units, width: " + width
                + " units, color: " + this.getColor());
    }
}
