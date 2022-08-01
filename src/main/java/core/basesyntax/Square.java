package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculate() {
        return side * side;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + calculate() + " sq.units"
                + ", radius: " + getSide() + " units"
                + ", color: " + getColor());
    }
}
