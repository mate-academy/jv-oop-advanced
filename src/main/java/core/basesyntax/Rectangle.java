package core.basesyntax;

public class Rectangle extends Figure {
    private static final String FIGURE_NAME = "rectangle";
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FIGURE_NAME + ", area: "
                + getArea() + " sq. units, length: " + length
                + " units, width: " + width + " units, color: " + getColor());
    }
}
