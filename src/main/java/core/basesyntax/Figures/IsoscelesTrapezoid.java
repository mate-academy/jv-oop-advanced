package core.basesyntax.Figures;

public class IsoscelesTrapezoid extends Figure {
    private int upSide;
    private int underSide;
    private int side;

    public IsoscelesTrapezoid(String color, int upSide, int underSide, int side) {
        super(color);
        this.upSide = upSide;
        this.underSide = underSide;
        this.side = side;
    }

    @Override
    public double getArea() {
        int halfPerimeter = (upSide + underSide + side * 2) / 2;
        return (int) Math.sqrt(((halfPerimeter - underSide) * (halfPerimeter - upSide)
                * (halfPerimeter - side) * 2));
    }

    @Override
    public String getDraw() {
        return "Figure: isoscelesTrapezoid, "
                + "area: "
                + getArea()
                + " sq. units, "
                + "sides: "
                + "upSide: "
                + upSide
                + " underSide: "
                + underSide
                + " sides: "
                + side
                + " units, "
                + "color: "
                + getColor();
    }
}
