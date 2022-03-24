package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(FigureType figureType, double side, Color color) {
        super(figureType, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getFigureType()
                + ", area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + super.getColor());
    }
}
