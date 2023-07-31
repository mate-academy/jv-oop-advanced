package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lowerBaseSide;
    private double upperBaseSide;
    private double height;

    public IsoscelesTrapezoid(String color, double lowerBaseSide, double upperBaseSide, double height) {
        super(color);
        this.lowerBaseSide = lowerBaseSide;
        this.upperBaseSide = upperBaseSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (lowerBaseSide + upperBaseSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: isosceles trapezoid, area: %s sq.units, lower base side: %s units, " +
                        "upper base side: %s units, height: %s units, color: %s", this.getArea(), this.lowerBaseSide
                , this.upperBaseSide, this.height, this.getColor()));
    }
}
