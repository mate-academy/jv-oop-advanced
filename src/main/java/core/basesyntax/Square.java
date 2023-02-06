package core.basesyntax;

public class Square extends Figure {
    private final int side;
    private final NameOfFigure name = NameOfFigure.SQUARE;

    public Square(Color color, int side) {
        this.setColor(color);
        this.side = side;
    }

    public NameOfFigure getName() {
        return name;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int areaCalculator() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().name()
                + " area: " + areaCalculator() + " sq.units, side: "
                + getSide() + " units, color: " + getColor());
    }
}
