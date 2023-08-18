package core.basesyntax;

public class Rectangle extends Figure implements Parametrs{
    private double height;
    private double weight;

    @Override
    public boolean isFlat() {
        return true;
    }

    @Override
    public boolean isSimple() {
        return false;
    }
}
