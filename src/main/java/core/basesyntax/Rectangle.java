package core.basesyntax;

class Rectangle extends Figure {
    private int rightSide;
    private int topSide;

    public Rectangle(String color, int topSide, int rightSide) {
        super(color);
        this.rightSide = rightSide;
        this.topSide = topSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + " the top side is of length: "
                + topSide
                + ", the right side is of length: "
                + rightSide
                + " and the color is: "
                + color);
    }
}
