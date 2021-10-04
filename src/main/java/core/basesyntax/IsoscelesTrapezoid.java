package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(double downSide, double upSide, double height, String color) {
        this.downSide = downSide;
        this.upSide = upSide;
        this.height = height;
        this.color = color;
    }

    @Override
    public double findArea() {
        return height / 2 * upSide * downSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: "
                + findArea() + " sq.units, height: " + height + " units, UpSide: "
                + upSide + " units, DownSide: "
                + downSide + "units, color: " + color);
    }
}
