package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(int width, int length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.round(width * length);
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, side weight: "
                + length + " units, color: " + getColor());
    }
}
