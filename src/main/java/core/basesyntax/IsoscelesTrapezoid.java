package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, InfoFigure {
    private final String name = "isosceles trapezoid";
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
        System.out.println(this.name + ", area: "
                + getArea() + " sq.units, "
                + this.upSide + " units, "
                + this.downSide + " units, "
                + this.height + " units, color: "
                + getColor()
        );
    }
}
