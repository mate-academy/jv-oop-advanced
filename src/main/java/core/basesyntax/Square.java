package core.basesyntax;

public class Square extends GeometricFigure {
    private final int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea()
                + " , side: "
                + side + ", color: "
                + color);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
