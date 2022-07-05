package core.basesyntax;

public class Square extends Figure {
    private int side;

    @Override
    public int GetArea() {
        return side * side;
    }
}
