package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    public double oneSide;
    public double secondSide;
    public double height;

    public IsoscelesTrapezoid(String color, double oneSide, double secondSide, double height) {
        super(color);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
        this.height = height;
    }
    @Override
    public double getAriaCalculation() {
        return ((oneSide + secondSide) / 2) * height;
    }
    @Override
    public void drawFigure() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getAriaCalculation() + " sq.units, one side: " + oneSide + " second side " + secondSide + " height " + height + ", color: " + color);
    }
}
