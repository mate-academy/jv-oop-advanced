package core.basesyntax;

public class Rectangle extends Figure {
    final static String FIGURE_NAME = "Recrtangle";
    private int length;
    private int width;

    public Rectangle(Color color, int length, int width) {
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
    public String draw() {
        return "Figure: " + FIGURE_NAME + ", area: "
                + getArea() + "sq. units, length: " + length
                + " units, width: " + width + " units, color: " + getColor();
    }
}
