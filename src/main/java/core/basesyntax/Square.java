package core.basesyntax;

class Square extends Figure {
    private final double side;
    private final String color;

    public Square(double side, String color) {
        super(color);
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        int intSide = (int) side;
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + intSide + " units, color: " + color);
    }
}
