package core.basesyntax;

public class Square extends Figure {

    private final int side;
    public Square(Color color, int side) {
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
        System.out.println("Figure: " + "Square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + "units, "
                + "color: " + getColor());

    }
}
