package core.basesyntax;

public class Square extends FigureForm implements AreaOfFigure, Draw {
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
        System.out.println("Figure: " + Figure.Square + ", area: " + getArea()
                + " sq.units, " + "side: " + side + " units, "
                + "color: " + getColor());
    }
}
