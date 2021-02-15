package core.basesyntax;

public class Square extends Figure {
    private int length;

    public Square(int length) {
        super(new ColorSupplier().get());
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.floor(length * length);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, " + "area: " + getArea() + ", length: " + length
                + ", color: " + getColor());
    }

    @Override
    public String toString() {
        return "Square{"
                + "length="
                + length
                + '}';
    }
}
