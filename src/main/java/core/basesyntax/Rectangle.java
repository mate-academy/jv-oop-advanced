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
        System.out.println("Figure: Rectangle,\n"
                + "area: " + getArea() + " sq. units,\n"
                + "height: " + height + " units,\n"
                + "width: " + width + " units,\n"
                + "color: " + getColor() + "\n");
    }
}
