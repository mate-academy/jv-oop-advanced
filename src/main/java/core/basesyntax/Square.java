package core.basesyntax;

public class Square extends Figure {
    private final int side;
    private final TypeOfFigure type = TypeOfFigure.SQUARE;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public TypeOfFigure getType() {
        return type;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Firgure: " + getType().name()
                + ", area: " + getArea()
                + " sq.units, side: " + getSide()
                + " units, color: " + getColor());
    }
}
