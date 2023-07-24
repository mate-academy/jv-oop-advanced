package core.basesyntax;

class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String draw() {
        return ("Figure: Rectangle, area: "
                + getArea()
                + " sq.units, "
                + "length: "
                + length
                + " units, "
                + "width: "
                + width
                + " units, "
                + "color: "
                + color);
    }
}
