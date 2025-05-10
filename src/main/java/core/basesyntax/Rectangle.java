package core.basesyntax;

class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(int length, int width, Color color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public double areaCalculator() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + areaCalculator()
                + " sq. units, length: " + length
                + " units, width: " + width
                + " units, color: " + color);
    }
}
