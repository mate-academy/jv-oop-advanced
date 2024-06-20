package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: Square, "
                + "area: "
                + String.format("%.2f", getArea())
                + " units, side: "
                + side
                + " units, color: "
                + getColor());
    }
}
