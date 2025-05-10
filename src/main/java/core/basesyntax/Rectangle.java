package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq.units, length: "
                + length + "  units, width " + width + "  units, color: " + super.getColor());
    }

}
