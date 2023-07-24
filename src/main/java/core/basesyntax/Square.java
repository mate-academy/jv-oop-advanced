package core.basesyntax;

class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return ("Figure: Square, area: "
                + getArea()
                + " sq.units, "
                + "side: "
                + side + " units, "
                + "color: "
                + color);
    }
}
