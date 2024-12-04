package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.pow(side, 2));
    }

    @Override
    public String toString() {
        return "Figure: "
                + this.getClass().getSimpleName().toLowerCase() + ", "
                + "area: " + this.calculateArea() + " sq. units, "
                + "side: " + this.side + ", "
                + "color: " + getColor().toString()
                + '}';
    }
}
