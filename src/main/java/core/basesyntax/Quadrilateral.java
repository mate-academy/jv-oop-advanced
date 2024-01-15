package core.basesyntax;

abstract class Quadrilateral extends Figure {
    protected int side1;
    protected int side2;
    protected int side3;
    protected int side4;

    @Override
    public void draw() {
        System.out.printf(", area: %.1f sq.units, sides are: %d-%d-%d-%d units, color: %s%n",
                area, side1,side2, side3, side4, color);
    }
}
