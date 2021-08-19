package core.basesyntax.model;

public class RightTriangle extends Figure {
    private final float side;
    private final float height;

    public RightTriangle(float side, float height) {
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
