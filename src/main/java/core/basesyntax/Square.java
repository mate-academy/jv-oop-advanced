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
    public void draw() {
        System.out.println("figure: Square" + " side: " + side + " units area: "
                + getArea() + " sq.units" + " color: " + color);
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }
}
