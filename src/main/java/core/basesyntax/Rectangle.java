package core.basesyntax;

public class Rectangle implements CountArea {
    private int length;
    private int width;

    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: rectangle, "
                + "area: " + Math.floor(getArea()) + " sq.units, "
                + "length: " + length + " units, "
                + "width: " + width + " units, "
                + "color: " + color.toString().toLowerCase());
    }
}
