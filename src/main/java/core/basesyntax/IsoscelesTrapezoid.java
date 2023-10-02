package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator {
    private double firstSide;
    private double secondSide;
    private double hight;
    public IsoscelesTrapezoid (String color, double firstSide, double secondSide, double hight) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * hight;
    }

    @Override
    public String figureType() {
        return "IsoscelesTrapezoid";
    }
}
