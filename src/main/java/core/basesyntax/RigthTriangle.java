package core.basesyntax;

public class RigthTriangle extends Figure {
    private int side;

    public RigthTriangle(int side, String color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public Double getArea() {
        return (side * side * Math.sqrt(3)) / 4;
    }

    @Override
    public void draw() {
        System.out.format("Figure: right triangle, area: %f, side: %d, color: %s",
                getArea(), getSide(), getColor());
    }
}
