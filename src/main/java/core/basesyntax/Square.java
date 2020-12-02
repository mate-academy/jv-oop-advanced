package core.basesyntax;

public class Square extends Figure {

    private double side;

    public Square(double size, String color) {
        super(color);
        this.side = size;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ", area : " + getArea()
                + " sq. units, " + "Its' side length is " + getSide()
                + " units , color: " + getColor().toLowerCase());
    }
}
