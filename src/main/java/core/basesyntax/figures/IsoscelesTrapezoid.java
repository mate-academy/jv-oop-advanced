package core.basesyntax.figures;

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
        double halfPerimeter = (upSide + underSide + side * 2) / 2;
        double result = Math.sqrt(((halfPerimeter - underSide) * (halfPerimeter - upSide)
                * (halfPerimeter - side) * 2));
        return Math.ceil(result);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, " + "area: "
                + getArea() + " sq. units, " + "sides: "
                + "upSide: " + upSide + " underSide: "
                + underSide + " sides: " + side
                + " units, " + "color: " + getColor());
    }
}
