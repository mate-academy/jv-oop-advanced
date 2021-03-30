package core.basesyntax;

public class Trapezoid extends Figure {
    private int side1;
    private int side2;

    public Trapezoid(String color, int side1, int side2, int height) {
        super("trapezoid", color, new Property("height", height));
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return ((side1 + side2) * getProperty().getValue()) / 2D;
    }
}
