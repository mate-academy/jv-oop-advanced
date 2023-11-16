package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area:" + getArea() + " sq. units, length: "
                + length + ", sq. units, width: "
                + width + " units, color: "
                + getSupplier().getRandomColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
