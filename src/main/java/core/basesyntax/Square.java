package core.basesyntax;

public class Square extends Figures {
    private int side;
    private final String name = "square";

    public void setSide(int side) {
        this.side = side;
    }

    //    Square getRandomSquare(Square square, ColorSupplier colorSupplier,
    //    Random random, int VALUE) {
    //        square.setColor(colorSupplier.getRandomColor());
    //        int randomSide = random.nextInt(VALUE) + 1;
    //        square.setSide(randomSide);
    //        return square;
    //    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, side: " + side
                + " units, color: " + getColor();
    }
}
