package core.basesyntax;

public class Square extends Figure {
    public static final int MAX_SIDE = 15;
    private int side;

    public Square() {
        this.side = this.getRandom().nextInt(MAX_SIDE);
        this.setColor();
    }

    public int getSide() {
        return side;
    }

    @Override
    public Double getArea() {
        return (double)side * side;
    }

    @Override
    public void draw() {
        System.out.format("Figure: square, area: %f, side: %d, color: %s",
                this.getArea(), this.getSide(), this.getColor());
    }
}
