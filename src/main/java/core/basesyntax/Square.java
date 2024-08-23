package core.basesyntax;

public class Square implements Figure {
    private String color;
    private int side;

    @Override
    public double getArea() {
        return side * side;
    }
}
