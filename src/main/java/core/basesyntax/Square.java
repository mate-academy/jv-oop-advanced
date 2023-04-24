package core.basesyntax;

public class Square implements Figure {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + color;
    }

}
