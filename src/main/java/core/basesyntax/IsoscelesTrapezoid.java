package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Parametrs{
    private double firsBase;
    private double secondBase;
    private double height;

    @Override
    public boolean isFlat() {
        return true;
    }

    @Override
    public boolean isSimple() {
        return false;
    }
}
