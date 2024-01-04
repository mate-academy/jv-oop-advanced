package core.basesyntax;

public class Square extends AbstractFigure {
    private final double side;
    private final Color color;

    public Square(double side, Color color) {
        super();
        this.side = side;
        this.color = color;
    }

    public Square(double side) {
        this(side, AbstractFigure.getRandomColor());
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

    @Override
    public Color getColor() {
        return color;
    }
}
