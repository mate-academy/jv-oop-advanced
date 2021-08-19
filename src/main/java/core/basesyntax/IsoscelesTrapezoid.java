package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upSide;
    private int downSide;
    private int height;

    public void setUpSide(int upSide) {
        this.upSide = upSide;
    }

    public void setDownSide(int downSide) {
        this.downSide = downSide;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.upSide + this.downSide) * this.height * 0.5;
    }

    @Override
    public void draw() {
        String information = String.format("Figure: isosceles trapezoid, "
                        + "area: %,.2f sq.units, %d units"
                        + ", %d units, %d units, color: %s",
                        getArea(), this.upSide, this.downSide, this.height, getColor());
        System.out.println(information);
    }
}
