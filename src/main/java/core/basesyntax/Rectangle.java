package core.basesyntax;

class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
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
