package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: "
                + area()
                + "sq. units, side: "
                + side
                + " units, "
                + "color: "
                + getColor();
    }

    @Override
    public double area() {
        return side * side;
    }
}
