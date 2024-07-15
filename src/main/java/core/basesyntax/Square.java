package core.basesyntax;

class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + " the side is of length: "
                + side
                + " and the color is"
                + color);
    }
}
