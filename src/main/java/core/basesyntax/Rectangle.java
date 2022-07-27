package core.basesyntax;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, height: " + height
                + " units, width: " + width
                + " units, color: " + getColor());
    }
}
