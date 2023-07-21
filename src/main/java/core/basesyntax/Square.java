package core.basesyntax;

class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
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
