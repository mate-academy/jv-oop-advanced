package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int side;

    public RightTriangle(Color color, int height, int side) {
        super(color);
        this.height = height;
        this.side = side;
    }

    @Override
    public double getArea() {
        return height * side * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle,\n"
                + "area: " + getArea() + " sq. units,\n"
                + "height: " + height + " units,\n"
                + "side: " + side + " units,\n"
                + "color: " + getColor() + "\n");
    }
}
