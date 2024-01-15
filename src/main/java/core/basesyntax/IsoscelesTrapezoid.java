package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upSide;
    private int downSide;
    private int lateralSides;

    public IsoscelesTrapezoid(int upSide, int downSide, int lateralSides) {
        this.upSide = upSide;
        this.downSide = downSide;
        this.lateralSides = lateralSides;
    }

    @Override
    public double getArea() {
        return ((double)(downSide + upSide) / 2) * Math.sqrt(lateralSides * lateralSides
                - (Math.pow(Math.abs(downSide - upSide), 2) / 4));
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder("Figure: isosceles trapezoid, area: ")
                .append(dF.format(getArea())).append(" sq.units, up side: ")
                .append(upSide).append(" units, down side: ").append(downSide)
                .append(" units, lateral sides: ").append(lateralSides)
                .append(" units" + ", color: ").append(getColor()));
    }
}
