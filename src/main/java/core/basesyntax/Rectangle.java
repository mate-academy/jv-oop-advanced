package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, length: "
                + length + " units, width: "
                + width + " units, color: " + color);
    }

    @Override
    public String getArea() {
        return String.format("%.1f", (double) length * width);
    }
}
