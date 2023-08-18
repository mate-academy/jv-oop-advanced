package core.basesyntax;

public class Square extends Figure implements Parametrs{
    private double side;

    @Override
    public boolean isFlat() {
        return true;
    }

    @Override
    public boolean isSimple() {
        return true;
    }
}
