package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureBehaviour {
    private double upperSide;
    private double downSide;
    private double trapezoidHeight;

    public IsoscelesTrapezoid(double upperSide, double downSide, double trapezoidHeight) {
        this.upperSide = upperSide;
        this.downSide = downSide;
        this.trapezoidHeight = trapezoidHeight;
    }

    public double getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(int topSide) {
        this.upperSide = topSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(int bottomSide) {
        this.downSide = bottomSide;
    }

    public double getTrapezoidHeight() {
        return trapezoidHeight;
    }

    public void setTrapezoidHeight(int trapezoidHeight) {
        this.trapezoidHeight = trapezoidHeight;
    }

    @Override
    public double getArea() {
        return ((getUpperSide() + getDownSide()) / 2) * getTrapezoidHeight();
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: isosceles trapezoid" + ", color: "
                +
                getColor() + ", upper side: " + getUpperSide() + ", down side: "
                +
                getDownSide() + ", height: " + getTrapezoidHeight() + ", area: " + getArea());
    }
}
