package core.basesyntax;

public class Square extends AbstractFigure {
    private Color color;
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea() + " square units, side: "
                + side + " units, color: "
                + getColor());
    }

    @Override
    public Color getColor() {
        return color;
    }
}

