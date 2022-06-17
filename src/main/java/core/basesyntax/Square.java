package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square() {
        super();
    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + getSide() + " units, color: " + getColor());
    }

    @Override
    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        return new Square(supplier.getRandomColor(), random.nextInt(100));
    }
}
