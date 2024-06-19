package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String draw() {
        return "Figure: Square, Area: "
                + getArea()
                + " units, side: "
                + side
                + " units, "
                + " Figure color: "
                + getColor();
    }
}

