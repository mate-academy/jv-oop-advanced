package core.basesyntax;

class Rectangle extends Figure {
    private final double length;
    private final double width;
    private final String color;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        int intLength = (int) length;
        int intWidth = (int) width;
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, length: "
                + intLength + " units, width: " + intWidth + " units, color: " + color);
    }
}

