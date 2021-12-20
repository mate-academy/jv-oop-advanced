package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getFigureArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square"
                + "\n"
                + "Figure Area: "
                + getFigureArea()
                + "\n"
                + "Side A, B: "
                + side
                + "\n"
                + "Color: "
                + getColor()
                + "\n");
    }

}
