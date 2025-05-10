package core.basesyntax;

public class Square extends Figure {
    private double side;

    {
        setFigureName("Square");
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName() + ", area: " + String.valueOf(getArea())
                + " sq.units, side: " + String.valueOf(side) + " units, color: " + getColor());
    }
}
