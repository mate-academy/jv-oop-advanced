package core.basesyntax;

public class Square extends Figure implements Area {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double areaCalculatro() {
        return side * side;
    }
}
