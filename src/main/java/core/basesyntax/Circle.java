package core.basesyntax;

public class Circle extends Figure implements Parametrs{
    private double radius;

    @Override
    public boolean isFlat() {
        return true;
    }

    @Override
    public boolean isSimple() {
        return true;
    }
}
