package core.basesyntax;

public class Rectangle extends Figure {
    private final int width;
    private final int length;

    public Rectangle(Color color, int width, int length) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Rectangle; area : " + getArea() + " sq.units, "
                + " width : " + width + " units, "
                + " length : " + length + " units, "
                + " color : " + getColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
