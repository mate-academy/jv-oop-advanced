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
        return (upSide + downSide) * height / 2;
    }

    @Override
    public String toString() {
        System.out.println("IsoscelesTrapezoid{" + "upSide=" + upSide
                + ", downSide=" + downSide
                + ", height=" + height + ", color='"
                + getColor() + '\'' + ", area=" + getArea() + '}');
        return "";
    }
}
