package core.basesyntax;

public class Square extends Figure {
    private double size;

    public Square(String color, double size) {
        super(color);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, "
                + "side length: " + getSize() + " units, color: " + getColor());
    }
}
