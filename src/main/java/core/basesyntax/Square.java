package core.basesyntax;

public class Square extends Figure {
    private final int size;

    public Square(String color, int size) {
        super(color);
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:" + getArea() + "sq.units, size: "
                + size + " units, color: " + color);
    }
}
