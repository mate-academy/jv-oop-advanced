package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {

    }

    public Square(String color,double side) {
        setColor(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        setArea(side * side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + getSide() + ", color:" + getColor());
    }
}
