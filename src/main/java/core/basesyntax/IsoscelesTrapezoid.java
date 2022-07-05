package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerBase;
    private int upperBase;
    private int height;

    @Override
    public int GetArea() {
        return ((lowerBase + upperBase) / 2) * height;
    }
}
