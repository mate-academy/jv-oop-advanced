package core.basesyntax.figure;

public class Square extends Figure {
    private double side;

    public Square(String figureType, String color, double side) {
        super(figureType, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String draw() {
        return "Figure: " + getFigureType()
                + ", area: " + getArea() + " sq.units,"
                + " side: " + side
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
