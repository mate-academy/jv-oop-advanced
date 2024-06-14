package core.basesyntax;

public class Square extends Figure {
    private static final String OUTPUT_SQUARE = "Figure: square, "
            + "area: %.2f sq. units, "
            + "side: %.2f units, "
            + "color: %s";
    private double side;

    public Square() {
        super();
    }

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf(OUTPUT_SQUARE,
                calculateArea(),
                side,
                color
        );
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
