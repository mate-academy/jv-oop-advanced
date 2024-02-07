package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double top;
    private final double bottom;
    private final double side;

    public IsoscelesTrapezoid(Color color, double top, double side, double bottom) {
        super(color);
        this.top = top;
        this.side = side;
        this.bottom = bottom;
    }

    @Override
    public double calculateArea() {
        return ((bottom + top) / 2)
                * (Math.pow((bottom - top) / 2,2)
                - Math.pow(side,2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid , area: "
                + calculateArea()
                + " side: "
                + side
                + " top: "
                + top
                + " bottom: "
                + bottom
                + " color: "
                + getColor());
    }
}
