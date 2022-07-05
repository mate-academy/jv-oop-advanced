package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    @Override
    public int GetArea() {
        return (int) (Math.PI * radius * radius);
    }
}
