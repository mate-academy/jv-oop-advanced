package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upSide;
    private int downSide;
    private int oneSide;

    public IsoscelesTrapezoid(int upSide, int downSide, int oneSide, String color) {
        super(color);
        this.upSide = upSide;
        this.downSide = downSide;
        this.oneSide = oneSide;
    }

    @Override
    public double getArea() {
        return ((upSide + downSide) / 2)
                * Math.sqrt(Math.pow(oneSide, 2)
                - ((Math.pow(upSide, 2)
                - 2
                * upSide
                * downSide
                + Math.pow(downSide, 2)) / 4));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + getArea()
                + " sq. units, upSide: "
                + upSide
                + " units, downSide: "
                + downSide
                + " units, oneSide: "
                + oneSide
                + " units, color: "
                + getColor());
    }
}
