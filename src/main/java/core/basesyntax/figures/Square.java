package core.basesyntax.figures;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    @Override
    public String getDetails() {
        return "side: " + side + " units";
    }

    @Override
    public String getName() {
        return "square";
    }
}
