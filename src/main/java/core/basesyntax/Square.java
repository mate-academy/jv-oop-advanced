package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureTypes.Square + ", area: " + getArea()
                + " sq.units, " + "side: " + side + " units, "
                + "color: " + getColor());
    }
}
