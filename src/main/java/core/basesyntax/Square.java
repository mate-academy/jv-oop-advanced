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
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.getClass().getName()
                + ", area: "
                + getArea()
                + " sq.units, side: "
                + getSide()
                + " units, color: "
                + getColor()
        );
    }
}
