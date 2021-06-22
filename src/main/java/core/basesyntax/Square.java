package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        setColor(color);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String printInfo() {
        return "Figure: square, area: " + Math.floor(getArea() * 100) / 100
                + " sq.units, side: " + (int) getSide() + " units, color: " + getColor();
    }
}
