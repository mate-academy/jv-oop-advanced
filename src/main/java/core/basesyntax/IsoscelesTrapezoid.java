package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side;
    private int upSide;
    private int downSide;
    private final int halfPerimeter = (2 * side + upSide + downSide) / 2;

    public IsoscelesTrapezoid(String color, int side, int upSide, int downSide) {
        super(color);
        this.side = side;
        this.upSide = upSide;
        this.downSide = downSide;
    }

    @Override
    public double getArea() {
        return Math.sqrt(Math.pow(halfPerimeter - side, 2)
                * (halfPerimeter - downSide) * (halfPerimeter - upSide));
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq.units, sides: " + side
                + " units, upSide: " + upSide
                + " units, downSide: " + downSide
                + " units, color: " + getColor();
    }
}
