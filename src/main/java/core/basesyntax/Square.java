package core.basesyntax;

public class Square extends Figure {
    private static final String FIGURE_NAME = "square";
    private int side;

    public Square(String color, int side) {
        super(color);
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
                + getArea() + " sq. units, side: " + side
                + " units, color: " + getColor());
    }
}
