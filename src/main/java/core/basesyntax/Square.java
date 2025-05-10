package core.basesyntax;

class Square extends Figure {
    private final int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public double areaCalculator() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + areaCalculator()
                + " sq. units, side: " + side
                + " units, color: " + color);
    }
}
