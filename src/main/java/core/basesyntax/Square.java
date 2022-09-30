package core.basesyntax;

public class Square implements FigureArea {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "";
    }
}
