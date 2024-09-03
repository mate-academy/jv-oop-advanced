package core.basesyntax;

public class RightTriangle extends Figure {
    private final double side;

    RightTriangle(String color, double side) {
        super(color);

        this.side = side;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
