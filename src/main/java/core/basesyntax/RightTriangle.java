package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString() +
                "side: " + side;
    }
}
