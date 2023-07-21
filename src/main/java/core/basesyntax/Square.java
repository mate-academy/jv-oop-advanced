package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color randomColor, double side) {
        super(DEFAULT_COLOR);
        this.side = side;
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
                + color);
    }
}
