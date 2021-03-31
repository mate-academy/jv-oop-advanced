package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public int areaCalculate() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %d sq. units, side length: %d units, color: %s\n",
                getName(), areaCalculate(), side, getColor());
    }
}
