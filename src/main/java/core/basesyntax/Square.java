package core.basesyntax;

public class Square extends Figure implements FigureArea {
    private final int side;

    public Square(int side, String color, String property) {
        setColor(color);
        setProperty(property);
        this.side = side;
        setPropertyLength(side);
        areaCalculate();
    }

    @Override
    public void areaCalculate() {
        setArea(Math.pow(side,2));
    }
}
