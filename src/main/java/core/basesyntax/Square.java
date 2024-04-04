package core.basesyntax;

class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double obtain() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + obtain() + " sq. units, side: "
                + side + " units, color: " + color);
    }
}
