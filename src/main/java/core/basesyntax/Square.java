package core.basesyntax;

class Square implements Figure {
    private final double side;
    private final Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, square: " + getArea()
                + " square o'clock, side: " + side + " od., color: " + color);
    }
}



