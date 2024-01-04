package core.basesyntax;

public class Square extends AbstractFigure {
    private final double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, "
                + "square: " + getArea() + " square o'clock, "
                + "side: " + side + " od., color: " + color);
    }
}
