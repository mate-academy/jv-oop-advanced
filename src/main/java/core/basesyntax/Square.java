package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private double side;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Square() {
    }

    public Square(double area, String color, double side) {
        super(area, color);
        this.side = side;
    }

    @Override
    public double countArea() {
        return side * side;
    }

    @Override
    public void draw() {
        Square randomSquare = new Square().createRandomSquare();
        System.out.println("Figure: square, area: "
                + randomSquare.countArea() + " sq.units, side: "
                + randomSquare.getSide() + " units, color: "
                + colorSupplier.getRandomColor());
    }

    public double getSide() {
        return side;
    }

    public Square createRandomSquare() {
        return new Square(countArea(), colorSupplier.getRandomColor(), random.nextInt(10));
    }
}
