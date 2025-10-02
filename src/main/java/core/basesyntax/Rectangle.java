package core.basesyntax;

public class Rectangle implements Figure {
    private final Color color;
    private static final String FIGURE_NAME = "Recrtangle";
    private int length;
    private int width;

    public Rectangle(Color color, int length, int width) {
        this.color = color;
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
                + getArea() + "sq. units, length: " + length
                + " units, width: " + width + " units, color: " + color);
    }
}
