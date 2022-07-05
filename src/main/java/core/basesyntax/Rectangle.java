package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    @Override
    public int GetArea() {
        return height * width;
    }
}
