package core.basesyntax;

public class Square extends Figure {
    private final int side;

    protected Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    protected int getSide() {
        return side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Square has drawn!");
    }

    @Override
    double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return super.toString()
                + "side: " + side + " units.";
    }
}
