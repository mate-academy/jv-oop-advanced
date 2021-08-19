package core.basesyntax;

public class RightTriangle extends Figure {
    private int longSide;
    private int shortSide;

    public RightTriangle(int longSide, int shortSide, String color) {
        super("Right Triangle", color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    public RightTriangle() {

    }

    @Override
    public double getArea() {
        return longSide * shortSide / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getType() + " area: " + getArea() + " sq.units, "
                    + "long side " + longSide + " units, "
                    + "short side " + shortSide
                    + " units, color: " + super.getColor());
    }
}
