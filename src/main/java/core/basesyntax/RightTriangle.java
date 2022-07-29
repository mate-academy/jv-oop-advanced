package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side * Math.sqrt(3) / 4;
    }

    @Override
    public String toString() {
        return "Figure: right triangle, "
                + "area: " + this.getArea() + " sq.units "
                + "side: " + side + " units "
                + "color: " + this.getColor();
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
