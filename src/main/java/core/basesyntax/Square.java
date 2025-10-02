package core.basesyntax;

public class Square implements Figure {
    private final Color color;
    private static final String FIGURE_NAME = "Square";
    private int side;

    public Square(Color color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FIGURE_NAME + ", area: "
                + getArea() + "sq. units, side: " + side
                + " units, color: " + color);
    }
}
