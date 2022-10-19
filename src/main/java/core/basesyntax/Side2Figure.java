package core.basesyntax;

public abstract class Side2Figure extends Figure {
    protected final int sideA;
    protected final int sideB;

    public Side2Figure(String color, int a, int b) {
        super(color);
        sideA = a;
        sideB = b;
    }
    @Override
    public abstract double getSquare();
}
