package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int bottomSide;
    private final int side;
    private final double height;

    public IsoscelesTrapezoid(String color, int topSide, int bottomSide, int side) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.side = side;
        height = 0.5 * (Math.abs(4 * Math.pow(side, 2)
                - Math.pow((bottomSide - topSide), 2)));
    }

    @Override
    public double calculateArea() {
        return 0.5 * (topSide + bottomSide) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + calculateArea()
                + " sq. units, top side: " + topSide
                + " units, bottom side: " + bottomSide + " units, left or right side: "
                + side + " units, color: " + getColor());
    }
}
