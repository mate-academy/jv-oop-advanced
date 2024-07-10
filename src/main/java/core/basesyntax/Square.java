package core.basesyntax;

public class Square implements Figure {
    private int side;
    private String color;
    public Square() {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
