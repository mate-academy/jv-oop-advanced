package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, width: " + width + " units, height: " + height + " units, color: " + getColor());
    }
}
