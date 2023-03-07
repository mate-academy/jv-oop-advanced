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
    public double area() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.println(" Figure square area: " + area() + " " + "side: "
                + side + " units" + "color: " + getColor());
    }
}
