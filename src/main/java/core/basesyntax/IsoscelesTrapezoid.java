package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public String getAdditionalInfo() {
        return "firstSide: " + firstSide + ", secondSide: " + secondSide + ", hight: " + height;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public String figureType() {
        return "IsoscelesTrapezoid";
    }
}
