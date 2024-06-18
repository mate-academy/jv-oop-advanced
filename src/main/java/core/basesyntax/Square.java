package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getArea() {
        return side * side;
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
                + side
                + " units, color:"
                + getColor());
    }
}
