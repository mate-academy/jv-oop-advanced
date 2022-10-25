package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String name, double side, String color) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double obtainTheArea() {
        return side * side;
    }

    @Override
    public void toDrawFigure() {
        System.out.println("Figure: " + super.getName().toLowerCase()
                + ", area: " + obtainTheArea() + " sq.units, side: " + this.side
                + " units, color: " + super.getColor().toLowerCase());
    }
}
