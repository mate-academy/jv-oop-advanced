package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private static final int MAX_SIDE = 25;
    private int side;

    public Square() {

    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side
                + " units, color: " + getColor().toLowerCase());
    }

    @Override
    public Figure createRandomFigure() {
        return new Square(new ColorSupplier().getRandomColor(), new Random().nextInt(MAX_SIDE));
    }
}
