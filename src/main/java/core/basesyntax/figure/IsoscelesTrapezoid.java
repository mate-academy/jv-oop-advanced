package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int upSide;
    private int downSide;

    public IsoscelesTrapezoid(String color, int lateralSide, int upSide, int downSide) {
        super(color);
        this.height = lateralSide;
        this.upSide = upSide;
        this.downSide = downSide;
    }

    @Override
    public double getArea() {
        return (double) (upSide + downSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, height: "
                + height + " units, upSide: "
                + upSide + " units, downSide: "
                + downSide + " units, color: "
                + getColor());
    }
}
