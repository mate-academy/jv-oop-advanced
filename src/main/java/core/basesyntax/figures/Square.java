package core.basesyntax.figures;

public class Square extends Figure {
    private final int side;

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
        System.out.println("Square{color: "
                + getColor()
                + "; side: "
                + side
                + "; area: "
                + getArea()
                + "}");
    }
}
