package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(Color color, TypeOfFigure typeOfFigure, int side) {
        super(color, typeOfFigure);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public TypeOfFigure getType() {
        return getTypeOfFigure();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Firgure: " + getType()
                + ", area: " + calculateArea()
                + " sq.units, side: " + getSide()
                + " units, color: " + getColor());
    }
}
