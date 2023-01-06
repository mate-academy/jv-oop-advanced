package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.setColor(color);
        this.setName(Figures.RECTANGLE.name());
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().toLowerCase()
                + ", color: " + getColor().toLowerCase() + ", area: "
                + String.format("%.2f", getArea()) + ", length: "
                + length + " units," + " width: " + width + " units");

    }
}
