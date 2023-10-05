package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        double squareArea;
        squareArea = side * side;
        return squareArea;
    }

    public void draw() {
        System.out.println("Figure: Square, " + "area: " + getArea() + " sq.units, " + "side: "
                + side + " units, " + "color: " + getColor());
    }
}
