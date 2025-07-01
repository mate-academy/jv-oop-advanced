package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color,double side) {
        setColor(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side,2);
    }

    @Override
    public String draw() {
        return "Figure: square, area: "
                + getArea() + " sq. units, side: "
                + getSide() + " units, color: " + getColor();
    }
}
