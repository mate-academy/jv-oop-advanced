package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double upSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(String color, double upSide, double downSide, double height) {
        super(color);
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (upSide + downSide) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure Circle, area :" + getArea() + " ,this upSide:" + upSide
                + " ,this downSide:" + downSide + " ,this height:" + height
                + " this, color:" + getColor());
    }
}
