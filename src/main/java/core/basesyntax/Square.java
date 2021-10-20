package core.basesyntax;

public class Square extends Figure {
    private int size;

    public Square(String color, int size) {
        super(color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public double areaInfo() {
        return 0;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: square, area: "
                + areaInfo() + " sq.units, size: "
                + getSize() + " units, color: "
                + getColor());
    }
}
