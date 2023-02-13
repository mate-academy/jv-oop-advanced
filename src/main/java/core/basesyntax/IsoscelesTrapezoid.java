package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int side;
    private final int upSide;
    private final int downSide;

    public IsoscelesTrapezoid(String color, int side, int upSide, int downSide) {
        super(color);
        this.side = side;
        this.upSide = upSide;
        this.downSide = downSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + calculateArea()
                + " sq.units, sides: " + side
                + " units, upSide: " + upSide
                + " units, downSide: " + downSide
                + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        int halfPerimeter = (2 * side + upSide + downSide) / 2;
        return Math.sqrt(Math.pow(halfPerimeter - side, 2)
                * (halfPerimeter - downSide) * (halfPerimeter - upSide));
    }
}
