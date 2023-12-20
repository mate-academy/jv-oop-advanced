package core.basesyntax.figure;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
        this.setFigureName(FigureName.Square);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getFigureName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "side: " + side
                + ", color: " + this.getColor();
    }
}
