package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getInfo() {
        return "Figure: " + getFigureName() + ", " + "area: " + getArea()
                + " sq.units, side: " + getSide() + ", color: " + getColor();
    }

    public Square setRandomSquare() {
        Square square = new Square();
        square.setFigureName("square");
        square.setSide(random.nextInt() + 1);
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }
}
