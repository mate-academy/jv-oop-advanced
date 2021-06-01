package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable {
    double upperSide;
    double bottomSide;
    double height;
    @Override
    public double draw() {
        return height / 2 * (upperSide + bottomSide);
    }
}
