package core.basesyntax;

import static core.basesyntax.FigureSupplier.DEFAULT_COLOR;

public class Square extends Figure {
    private double side;
    private final Color squareColor;

    public Square(Color randomColor, double side) {
        super(DEFAULT_COLOR);
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
