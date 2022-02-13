package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements FigureArea, Draw {
    private int side;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public Square() {
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public Figure getRandomFigure() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(10));
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getDraw() {
        return "Square, area: "
                + getArea()
                + " sq.units, "
                + "side: " + side
                + "units, "
                + "color: " + getColor();
    }

    @Override
    public String toString() {
        return getDraw();
    }
}
