package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int size) {
        super(color);
        this.side = size;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double areaInfo() {
        return side * side;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: square, area: "
                + areaInfo() + " sq.units, side: "
                + getSide() + " units, color: "
                + getColor());
    }
}
