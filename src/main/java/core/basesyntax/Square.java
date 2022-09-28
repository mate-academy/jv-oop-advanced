package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        if (!FigureDimensionsValidator.isValidDimensions(side)) {
            throw new FigureDimensionError(this.getClass().getSimpleName());
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return super.draw() + " { side: " + side + " units , area: "
                + getArea() + " square units, color: " + getColor() + " }";
    }
}
