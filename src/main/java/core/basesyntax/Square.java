package core.basesyntax;

public class Square extends Figure {
    private int side1;

    public Square(String color, int side1) {
        super(color);
        this.side1 = side1;
    }

    public int getArea() {
        return side1 * side1;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: Square, "
                + "area: "
                + getArea()
                + " units, side: "
                + side1
                + " units, color:"
                + color);
    }
}
