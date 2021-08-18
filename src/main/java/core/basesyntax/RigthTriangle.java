package core.basesyntax;

public class RigthTriangle extends Figure {
    private static final int MAX_SIDE = 15;
    private int side;

    public RigthTriangle() {
        side = this.getRandom().nextInt(MAX_SIDE);
        this.setColor();
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
                this.getArea(), this.getSide(), this.getColor());
    }
}
