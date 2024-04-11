package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(Color color, int width, int height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "Square"
                + ","
                + " area: "
                + getArea()
                + " sq. units,"
                + " width: "
                + width
                + " height: "
                + height
                + " units,"
                + " color: "
                + getColor());
    }
}
