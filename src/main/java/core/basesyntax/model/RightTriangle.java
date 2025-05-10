package core.basesyntax.model;

public class RightTriangle extends Figure {
    private final double side;
    private final double height;

    public RightTriangle(double side, double height) {
        this.side = side;
        this.height = height;

    }

    @Override
    public double getArea() {
        return side * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea()
                + " sq.units, side: " + side
                + ", height: " + height
                + ", colour: " + getColour());
    }

}
