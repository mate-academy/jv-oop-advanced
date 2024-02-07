package core.basesyntax.figures;

public class Square extends GeometricFigure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("GeometricFigure: square, area: " + getArea()
                + " sq.units, sides: " + side + " units, color: " + getColor());
    }
}
