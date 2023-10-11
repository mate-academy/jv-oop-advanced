package core.basesyntax;

class Square extends Figure {
    private final int side;
    private final String color;

    public Square(int side, String color) {
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
                + side + " units, color: " + color);
    }
}
