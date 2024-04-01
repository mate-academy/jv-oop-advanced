package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int downSide;
    private int topSide;
    private int lateralSide;

    public IsoscelesTrapezoid(int downSide, int topSide, int lateralSide, String color) {
        this.downSide = downSide;
        this.topSide = topSide;
        this.lateralSide = lateralSide;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        double heightTrapezoid = Math.sqrt(Math.pow(lateralSide, 2)
                - ((Math.pow((downSide - topSide), 2)) / 4));
        return Math.round(((downSide + topSide) / 2) * heightTrapezoid);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, "
                + "area: " + getArea() + " sq. units, "
                + "downSide: " + getDownSide() + " units, "
                + "topSide: " + getTopSide() + " units, "
                + "lateralSide: " + getLateralSide() + " units, "
                + "color: " + getColor());
    }

    public int getDownSide() {
        return downSide;
    }

    public int getLateralSide() {
        return lateralSide;
    }

    public int getTopSide() {
        return topSide;
    }
}
