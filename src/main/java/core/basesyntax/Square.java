package core.basesyntax;

public class Square extends Figure {
    private final int side;
    private final FigureType figureType = FigureType.SQUARE;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType()
                + ", area: " + getArea()
                + " sq.units, side: " + getSide()
                + " units, color: " + getColor());
    }
}
