package core.basesyntax;

public class Square extends ColoredFigure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((side * side) * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + getColor());
    }
}
