package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, FigureDraw {
    private double bottomSide;
    private double upperSide;
    private double equalSides;

    public IsoscelesTrapezoid(String color, double bottomSide,
                              double upperSide, double equalSides) {
        super(color);
        this.bottomSide = bottomSide;
        this.upperSide = upperSide;
        this.equalSides = equalSides;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(double upperSide) {
        this.upperSide = upperSide;
    }

    public double getEqualSides() {
        return equalSides;
    }

    public void setEqualSides(double equalSides) {
        this.equalSides = equalSides;
    }

    @Override
    public double getArea() {
        return ((bottomSide + upperSide) / 2) * (Math.sqrt(Math.pow(equalSides, 2)
                - (Math.pow(bottomSide - upperSide, 2) / 4)));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, bottom side: " + bottomSide
                + " units, upper side: " + upperSide + " units, equal sides: "
                + equalSides + " units, color: " + getColor());
    }
}
