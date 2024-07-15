package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int side;

    public IsoscelesTrapezoid(String color, int top, int bottom, int side) {
        super(color);
        this.side = side;
        this.bottom = bottom;
        this.top = top;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + " the sides are of length: "
                + side
                + ", the bottom is of length: "
                + bottom
                + ", the top is of length: "
                + top
                + " and the color is: "
                + super.color);
    }
}
