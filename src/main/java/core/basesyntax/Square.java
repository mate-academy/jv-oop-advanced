package core.basesyntax;

public class Square extends Figure {
    public static final double MAX_SIDE = 10;
    private final double side;
    private final TypeFigure name = TypeFigure.SQUARE;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public TypeFigure getName() {
        return name;
    }

    public double getSide() {
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
