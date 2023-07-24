package core.basesyntax;

public class Square extends Figure {
    private double side;
    private final Color squareColor;

    public Square(Color randomColor, double side) {
        super(Parameters.DEFAULT_COLOR);
        this.side = side;
        this.squareColor = randomColor;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + squareColor);
    }
}
