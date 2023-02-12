package core.basesyntax;

public class Square extends Figure {
    private final int side;
    private final TypeFigure name = TypeFigure.SQUARE;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public TypeFigure getName() {
        return name;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().name()
                + " area: " + calculateArea() + " sq.units, side: "
                + getSide() + " units, color: " + getColor());
    }
}
