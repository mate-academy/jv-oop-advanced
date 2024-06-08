package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        this.setColor(color);
    }

    public void draw() {
        System.out.printf("Figure: square, side"
                + side
                + ", color: "
                + getColor().toLowerCase()
                + "\n"
        );
    }
}
