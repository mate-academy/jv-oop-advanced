package core.basesyntax;

public abstract class Side1Figure extends Figure {
    protected final int sideA;

    public Side1Figure(String color, int a) {
        super(color);
        sideA = a;
    }
    @Override
    public abstract double getSquare();
}
