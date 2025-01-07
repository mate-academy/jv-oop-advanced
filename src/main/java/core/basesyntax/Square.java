package core.basesyntax;

class Square extends Figure {
    private final double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area() + " sq. units, side: " + side + " units, color: " + getColor());
    }
}
