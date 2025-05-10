package core.basesyntax;

public class RightTriangle extends Figure {
    private final double side;

    public RightTriangle(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 0.5 * Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle , area: "
                + calculateArea()
                + " side: "
                + side
                + " color:"
                + getColor());
    }
}
