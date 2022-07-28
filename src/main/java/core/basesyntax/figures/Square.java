package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.ColorSupplier;
import core.basesyntax.Figure;
import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void printArea() {
        System.out.println(side * side);
    }

    @Override
    public Figure getRandomParameters() {
        Random random = new Random();
        int max = Figure.MAX_VALUE_OF_PARAM;
        Color squareColor = new ColorSupplier().getRandomColor();
        return new Square(squareColor, random.nextInt(max));
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor();
    }
}
