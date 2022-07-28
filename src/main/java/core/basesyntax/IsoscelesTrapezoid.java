package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable {
    private int upperSide;
    private int lowerSide;
    private int lateralSide;

    public IsoscelesTrapezoid(int upperSide, int lowerSide, int lateralSide, String color) {
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.lateralSide = lateralSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((upperSide + lowerSide) / 2) *
                Math.sqrt(Math.pow(lateralSide, 2) -
                        (Math.pow(lowerSide - upperSide, 2) / 4));
    }
}
