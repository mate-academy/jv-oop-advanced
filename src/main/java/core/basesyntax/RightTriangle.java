package core.basesyntax;

public class RightTriangle extends Figure {
    private final int sideLength;

    public RightTriangle(String color, int sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double getFigureArea() {
        final int quantity = 3;
        return quantity * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right-Triangle "
                + "\n"
                + "Figure Area: "
                + getFigureArea()
                + "\n"
                + "Side Length: "
                + sideLength
                + "\n"
                + "Color: "
                + getColor()
                + "\n");
    }

}
