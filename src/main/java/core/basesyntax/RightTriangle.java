package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return 0.25 * side * side * Math.sqrt(3);
    }

    @Override
    public void print() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, side: " + getSide() + " units, color: " + getColor());
    }

    @Override
    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        return new RightTriangle(supplier.getRandomColor(), random.nextInt(100));
    }
}
