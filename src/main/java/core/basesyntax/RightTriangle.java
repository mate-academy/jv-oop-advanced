package core.basesyntax;

public class RightTriangle extends Figure implements Parametrs{
    private double firstLeg;
    private double secondLeg;


    @Override
    public boolean isFlat() {
        return true;
    }

    @Override
    public boolean isSimple() {
        return false;
    }
}
