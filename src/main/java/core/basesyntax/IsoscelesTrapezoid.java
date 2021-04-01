package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    double upperSide;
    double lowerSide;
    double height;
    double diagonal1;
    double diagonal2;

    public IsoscelesTrapezoid(double upperSide, double lowerSide, double height, double diagonal1, double diagonal2) {
        if (diagonal1 == diagonal2) {
            this.upperSide = upperSide;
            this.lowerSide = lowerSide;
            this.height = height;
        }
    }

    @Override
    public void calculateArea() {
        this.area = (upperSide + lowerSide) / 2 * height;
    }

    @Override
    public void draw() {

    }
}
