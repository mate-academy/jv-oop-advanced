package core.basesyntax;

public class Square extends Figure {
    final static String FIGURE_NAME = "Square";
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
    public String draw() {
        return "Figure: " + FIGURE_NAME + ", area: "
                + getArea() + "sq. units, side: " + side
                + " units, color: " + getColor();
    }
}
