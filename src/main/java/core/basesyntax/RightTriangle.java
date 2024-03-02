package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;
    private double hypotenuse;

    public RightTriangle(String color, double side) {
        super(color);
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public String toString() {
        return super.toString() + "side: " + side;
    }
}
