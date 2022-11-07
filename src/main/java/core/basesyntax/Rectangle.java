package core.basesyntax;

public class Rectangle extends Figure {
    private static final String name = "rectangle";
    private final int width;
    private final int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: " + name
                + ", area: " + df.format(getArea()) + " sq.units"
                + ", width: " + this.width
                + ", height: " + this.height
                + ", color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
