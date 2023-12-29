package core.basesyntax;

class Rectangle implements Figure {
    private final double length;
    private final double width;
    private final Color color;

    public Rectangle(double length, double width, Color color) {
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
        System.out.println("Figure: straight-square, squares: " + getArea()
                + " square one, dominant: " + length + " odes, width: "
                + width + " od., color: " + color);
    }
}
