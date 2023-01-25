package core.basesyntax;

public class RightTriangle extends Figure {

    private final double side;
    private final double height;

    public RightTriangle(Color color, double side, double height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = side * height / 2;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "RightTriangle, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + "units, "
                + "height: " + height + "units, "
                + "color: " + getColor());

    }
}
