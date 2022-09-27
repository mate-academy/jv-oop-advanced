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
    public double areaCalculator() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.getClass().getName()
                + ", area: "
                + areaCalculator()
                + " sq.units, side: "
                + getSide() + " units, color: " + getColor());
    }
}
