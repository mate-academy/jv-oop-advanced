package core.basesyntax;

public class Square extends Figure {

    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public Square() {

    }

    public double calcArea() {
        return super.setArea(Math.pow(this.side, 2));
    }

    @Override
    public String toString() {
        return "Figure: Square, " +
                "area: " + calcArea() +
                " sq.units, side: " +
                side +
                " units, color: " + super.getColor();
    }
}
