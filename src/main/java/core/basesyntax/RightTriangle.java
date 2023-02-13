package core.basesyntax;

public class RightTriangle implements CountArea {
    private int side;
    private int height;

    public RightTriangle (int side, int height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (side * height) / 2;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: right triangle, "
                + "area: " + Math.floor(getArea()) + " sq.units, "
                + "side: " + side + " units, "
                + "height: " + height + " units, "
                + "color: " + color.toString().toLowerCase());
    }
}
